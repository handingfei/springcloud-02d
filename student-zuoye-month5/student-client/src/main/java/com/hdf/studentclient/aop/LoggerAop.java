package com.hdf.studentclient.aop;

import com.hdf.dto.LogDto;
import com.hdf.studentclient.annonation.Log;
import com.hdf.studentclient.service.impl.LogServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;


import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.Arrays;

@Component
@Aspect
@Slf4j
public class LoggerAop {

    @Autowired
    LogServiceImpl logService;

    @Pointcut("execution(* com.hdf.studentclient.controller.*.*(..))")
    public void pointcut(){}

    @AfterReturning(pointcut = "pointcut()")
    public void after(JoinPoint joinPoint){
        Method method = ((MethodSignature) joinPoint.getSignature()).getMethod();
        Log annotation =  method.getAnnotation(Log.class);
        if (annotation!=null){
            ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
            HttpServletRequest request = requestAttributes.getRequest();
            log.info(request.getMethod());
            log.info(request.getRequestURI());
            log.info(request.getRequestURL().toString());
            log.info(request.getServerPort()+"");
            log.info(request.getRemoteAddr());
            log.info(annotation.desc());
            log.info(Arrays.toString(joinPoint.getArgs()));
            LogDto logDto = new LogDto();
            logDto.setDesc(annotation.desc());
            logDto.setMethod(request.getMethod());
            logDto.setRemoteAddr(request.getRemoteAddr());
            logDto.setUri(request.getRequestURI());
            logDto.setUrl(request.getRequestURL().toString());
            logDto.setServerPort(request.getServerPort()+"");
            logDto.setArgs(joinPoint.getArgs());
            logDto.setUsername("张三");
            logService.mongo(logDto);
        }
    }
}

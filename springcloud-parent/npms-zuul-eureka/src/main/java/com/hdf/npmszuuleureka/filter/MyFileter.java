package com.hdf.npmszuuleureka.filter;

import com.alibaba.fastjson.JSON;
import com.hdf.vo.ResultEntity;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Component
@Slf4j
public class MyFileter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @SneakyThrows
    @Override
    public Object run() throws ZuulException {

        log.info("过滤器开始.............");
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
        String token = request.getParameter("token");
        if (StringUtils.isEmpty(token)){
            context.setSendZuulResponse(false);
            context.setResponseStatusCode(401);

            HttpServletResponse response = context.getResponse();
            response.setContentType("applicantion/json;charset=utf-8");

            PrintWriter writer = null;
            try {
                writer = response.getWriter();
                writer.write(JSON.toJSONString(ResultEntity.fail("500","token为空")));
                writer.flush();

            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                writer.close();
            }
        }

        return null;
    }
}

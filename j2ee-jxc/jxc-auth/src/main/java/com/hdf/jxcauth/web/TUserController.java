package com.hdf.jxcauth.web;


import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.hdf.jxc.common.vo.ResultEntity;
import com.hdf.jxcauth.entity.TUser;
import com.hdf.jxcauth.service.ITUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.provider.token.ConsumerTokenServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;


/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Mht
 * @since 2020-02-20
 */
@RestController
@RequestMapping("/admin")
@Slf4j
public class TUserController {

    @Autowired
    ConsumerTokenServices consumerTokenServices;

    @RequestMapping("/token/logout")
    public ResultEntity logout(String access_token){
        if(consumerTokenServices.revokeToken(access_token)){
            return ResultEntity.ok("注销成功");
        }else {
            return ResultEntity.ok("注销失败");
        }

    }

    @GetMapping("/user/info")
    public Principal user(Principal member) {
        return member;
    }

    @Autowired
    ITUserService itUserService;
    @RequestMapping("/test")
    public String  test(){
        Wrapper wrapper = new EntityWrapper<TUser>();
        List list = itUserService.selectList(wrapper);
        log.info("list:{}", JSON.toJSONString(list));
        return "成功";
    }




}

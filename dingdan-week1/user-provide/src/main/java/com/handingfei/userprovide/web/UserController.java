package com.handingfei.userprovide.web;


import com.handingfei.userprovide.entity.User;
import com.handingfei.userprovide.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * <p>
 * InnoDB free: 7168 kB 前端控制器
 * </p>
 *
 * @author Mht
 * @since 2020-09-14
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService iUserService;

    /**
     * 调动接口服务
     * @return
     */
    @RequestMapping("/list")
    public List<User> list(){
        List<User> users = iUserService.list1();

        System.out.println(users);
        return users;
    }

}

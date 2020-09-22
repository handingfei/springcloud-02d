package com.handingfei.userprovide;

import com.handingfei.userprovide.entity.User;
import com.handingfei.userprovide.service.IUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class UserProvideApplicationTests {

    @Autowired
    IUserService iUserService;

    @Test
    void contextLoads() {
    }
    /**
     * 调动接口服务
     * @return
     */
    @Test
    void findUser(){

        User user = new User();
        List<User> users = iUserService.list1();

        System.out.println(user);

    }

}

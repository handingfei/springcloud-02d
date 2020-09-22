package com.hdf.upmsbizeurekafegin.web;


import com.hdf.dto.UserDto;
import com.hdf.upmsbizeurekafegin.service.UserSerivce;
import com.hdf.vo.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserSerivce userSerivce;

    @RequestMapping("/user/list")
    public ResultEntity getUser(UserDto userDto){
        ResultEntity list = userSerivce.list(userDto);
        return list;
    }
}

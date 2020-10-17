package com.hdf.shoppinguserservice.controller;

import com.hdf.dto.UserDto;
import com.hdf.shoppinguserservice.entity.TUserEntity;
import com.hdf.shoppinguserservice.service.UserService;
import com.hdf.utils.MD5Utils;
import com.hdf.vo.ResultEntity;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/user/list")
    public ResultEntity list(UserDto userDto, HttpSession session){
        TUserEntity byusername = userService.findByusername(userDto.getUsername());
        if(byusername==null){
            return ResultEntity.fail("用户名不存在");
        }
        if(!byusername.getPassword().equals(MD5Utils.md5(userDto.getPassword()))){
            return ResultEntity.fail("密码错误");
        }
        UserDto userDto1=new UserDto();
        BeanUtils.copyProperties(byusername,userDto1);
        session.setAttribute("user",userDto1);
         return ResultEntity.success();
    }
    @RequestMapping("/user/save")
    public ResultEntity save(UserDto userDto){
        TUserEntity byusername = userService.findByusername(userDto.getUsername());
        if(byusername!=null){
            return ResultEntity.fail("用户名已存在");
        }

        userService.add(userDto);
        return ResultEntity.success();
    }

}

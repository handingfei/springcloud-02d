package com.hdf.upms.biz.web;


import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hdf.dto.Page;
import com.hdf.dto.UserDto;
import com.hdf.upms.biz.entity.User;
import com.hdf.upms.biz.service.IUserService;
import com.hdf.vo.ResultEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * InnoDB free: 7168 kB; (`province`) REFER `kylin_hdf/nation`(`id`); (`city`) REFE 前端控制器
 * </p>
 *
 * @author Mht
 * @since 2020-09-08
 */
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Autowired
    IUserService iUserService;

    @RequestMapping("/list")
    public ResultEntity list(@RequestBody UserDto userDto){

        log.info(JSON.toJSONString(userDto));
        PageHelper.startPage(userDto.getPageNo(),userDto.getPageSize());
        Wrapper wrapper = new EntityWrapper();
        List list = iUserService.selectList(wrapper);
        PageInfo<UserDto> pageInfo = new PageInfo(list);
        return ResultEntity.success("200","操作成功",pageInfo);
    }

    @RequestMapping("/save")
    public ResultEntity save(@RequestBody UserDto userDto){

        User user = new User();
        BeanUtils.copyProperties(userDto,user);
        user.setUserface(userDto.getImages().get(0));
        this.iUserService.insert(user);


        return ResultEntity.success();
    }

}

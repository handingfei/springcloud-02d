package com.hdf.upms.biz.web;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hdf.upms.biz.dto.Page;
import com.hdf.upms.biz.dto.UserDto;
import com.hdf.upms.biz.service.IUserService;
import com.hdf.upms.biz.vo.ResultEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
public class UserController {

    @Autowired
    IUserService iUserService;

    @RequestMapping("/list")
    public ResultEntity list(UserDto userDto){

        PageHelper.startPage(userDto.getPageNo(),userDto.getPageSize());
        Wrapper wrapper = new EntityWrapper();

        List list = iUserService.selectList(wrapper);
        PageInfo pageInfo = new PageInfo(list);
        return ResultEntity.success("200","操作成功",list);
    }


}

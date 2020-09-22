package com.hdf.userclient.web;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hdf.dto.Week2userDto;
import com.hdf.userclient.entity.Week2user;
import com.hdf.userclient.service.IWeek2userService;
import com.hdf.vo.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * InnoDB free: 7168 kB 前端控制器
 * </p>
 *
 * @author handingfei
 * @since 2020-09-21
 */
@RestController
@RequestMapping("/week2user")
public class Week2userController {

    @Autowired
    private IWeek2userService iWeek2userService;

    /**
     * 页面
     * @param week2userDto
     * @param vo
     * @return
     */
    @RequestMapping("/list")
    public ResultEntity list(Week2userDto week2userDto,Week2user vo){

        PageHelper.startPage(week2userDto.getSize(),week2userDto.getCurrent());

        List<Week2user> list = iWeek2userService.list1(week2userDto,vo);
        PageInfo<Week2user> pageInfo = new PageInfo<>(list);

        return ResultEntity.suess("200","成功",pageInfo);
    }
}

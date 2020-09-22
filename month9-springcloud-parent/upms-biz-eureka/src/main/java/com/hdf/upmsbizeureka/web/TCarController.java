package com.hdf.upmsbizeureka.web;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hdf.dto.TCarDto;
import com.hdf.upmsbizeureka.entity.TCar;
import com.hdf.upmsbizeureka.service.ITCarService;
import com.hdf.vo.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * InnoDB free: 7168 kB 前端控制器
 * </p>
 *
 * @author handingfei
 * @since 2020-09-16
 */
@RestController
@RequestMapping("/tCar")
public class TCarController {

    @Autowired
    ITCarService itCarService;

    @RequestMapping("/list")
    public ResultEntity list(@RequestBody TCarDto tCarDto){

        PageHelper.startPage(tCarDto.getCurrent(),tCarDto.getSize());
        Wrapper<TCar> wrapper = new EntityWrapper<>();

        List<TCar> list = itCarService.selectList(wrapper);

        PageInfo<TCar> pageInfo = new PageInfo<>(list);

        return ResultEntity.success("200","成功",pageInfo);
    }

    @RequestMapping("/list1")
    public ResultEntity list1(@RequestBody TCarDto tCarDto){

        PageHelper.startPage(tCarDto.getCurrent(),tCarDto.getSize());

        Wrapper<TCar> wrapper = new EntityWrapper<>();
        List<TCar> list = itCarService.list1(wrapper);

        PageInfo<TCar> pageInfo = new PageInfo<>(list);

        return ResultEntity.success("200","成功",pageInfo);
    }


}

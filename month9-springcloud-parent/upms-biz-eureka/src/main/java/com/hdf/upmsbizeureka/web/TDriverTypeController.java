package com.hdf.upmsbizeureka.web;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.hdf.upmsbizeureka.entity.TDriverType;
import com.hdf.upmsbizeureka.service.ITDriverTypeService;
import com.hdf.vo.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/tDriverType")
public class TDriverTypeController {

    @Autowired
    ITDriverTypeService itDriverTypeService;

    @RequestMapping("/findAll")
    public ResultEntity list(){

        Wrapper<TDriverType> wrapper = new EntityWrapper<>();

        List<TDriverType> list1 = itDriverTypeService.selectList(wrapper);

        return ResultEntity.success("200","驾照等级下拉查询成功",list1);
    }


}

package com.lianxi.eurekajpa.controller;

import com.hdf.dto.ManytooneEntityDto;
import com.hdf.vo.ResultEntity;
import com.lianxi.eurekajpa.entity.ManytooneEntity;
import com.lianxi.eurekajpa.service.ManyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ManyController {

    @Autowired
    ManyService manyService;

    @RequestMapping("/many/list")
    public ResultEntity list(ManytooneEntityDto dto){

        List<ManytooneEntity> list = manyService.list();

        return ResultEntity.success("200","成功",list);
    }

}

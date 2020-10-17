package com.hdf.shoppingitemservice.controller;

import com.alibaba.fastjson.JSON;
import com.hdf.dto.TItemDto;
import com.hdf.shoppingitemservice.entity.TItemEntity;
import com.hdf.shoppingitemservice.service.TItemService;
import com.hdf.vo.ResultEntity;
import com.hdf.vo.TItemVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TiemController {


    @Autowired
    TItemService itemService;
    @RequestMapping("/tiem/list")
    public ResultEntity findPage(TItemDto dto){
        Page<TItemEntity> all = itemService.findAll(dto);
          System.err.println(JSON.toJSONString(all));
        return ResultEntity.success("200","成功",all);
    }
    
    @RequestMapping("/tiem/findById")
    public TItemVo findById(@RequestBody Integer id){

        TItemEntity byId = itemService.findById(id);
        TItemVo tItemVo=new TItemVo();
        BeanUtils.copyProperties(byId,tItemVo);
        return tItemVo;

    }

}

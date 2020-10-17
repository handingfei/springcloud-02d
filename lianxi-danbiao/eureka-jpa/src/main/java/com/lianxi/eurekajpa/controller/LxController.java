package com.lianxi.eurekajpa.controller;

import com.hdf.dto.LianxiEntityDto;
import com.hdf.vo.ResultEntity;
import com.lianxi.eurekajpa.entity.LianxiEntity;
import com.lianxi.eurekajpa.service.LxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LxController {

    @Autowired
    LxService lxService;

    @RequestMapping("/lx/list")
    public ResultEntity list(LianxiEntityDto lianxiEntityDto){

        Page<LianxiEntity> page = lxService.getPage(lianxiEntityDto);
        /*Page<LianxiEntity> page1 = lxService.getPage1(lianxiEntityDto);*/

        return ResultEntity.success("200","成功", page);
    }

    @RequestMapping("/lx/save")
    public boolean save(@RequestBody LianxiEntity lianxiEntity){
        return lxService.save(lianxiEntity);
    }

    @RequestMapping("/lx/delete")
    public ResultEntity delete(Integer[] ids){
        lxService.dels(ids);

        return ResultEntity.success("200","成功");
    }

}

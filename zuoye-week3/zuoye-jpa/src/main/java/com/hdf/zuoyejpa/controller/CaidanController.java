package com.hdf.zuoyejpa.controller;

import com.hdf.dto.CaidanEntityDto;
import com.hdf.vo.ResultEntity;
import com.hdf.zuoyejpa.entity.CaidanEntity;
import com.hdf.zuoyejpa.service.CaidanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CaidanController {

    @Autowired
    CaidanService caidanService;

    @RequestMapping("/caidan/list")
    public ResultEntity getPage(CaidanEntityDto caidanEntityDto){

        Page<CaidanEntity> page = caidanService.getPage(caidanEntityDto);

        return ResultEntity.suess("200","成功",page);
    }


}

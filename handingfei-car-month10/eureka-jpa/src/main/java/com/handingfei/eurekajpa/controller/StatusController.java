package com.handingfei.eurekajpa.controller;

import com.handingfei.dto.TCarStatusEntityDto;
import com.handingfei.eurekajpa.entity.TCarStatusEntity;
import com.handingfei.eurekajpa.service.StatusService;
import com.handingfei.vo.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StatusController {

    @Autowired
    StatusService statusService;

    /**
     * status的下拉框
     * @param tCarStatusEntityDto
     * @return
     */
    @RequestMapping("/status/list")
    public ResultEntity list(TCarStatusEntityDto tCarStatusEntityDto){
        List<TCarStatusEntity> list = statusService.list(tCarStatusEntityDto);
        return ResultEntity.success("200","成功",list);
    }

}

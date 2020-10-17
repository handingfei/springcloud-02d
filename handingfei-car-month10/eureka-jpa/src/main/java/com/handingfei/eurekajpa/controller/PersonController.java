package com.handingfei.eurekajpa.controller;

import com.handingfei.dto.TCarStatusEntityDto;
import com.handingfei.dto.TPersonEntityDto;
import com.handingfei.eurekajpa.entity.TCarStatusEntity;
import com.handingfei.eurekajpa.entity.TPersonEntity;
import com.handingfei.eurekajpa.service.PersonService;
import com.handingfei.eurekajpa.service.StatusService;
import com.handingfei.vo.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    PersonService personService;

    /**
     * person的下拉框
     * @param tPersonEntityDto
     * @return
     */
    @RequestMapping("/person/list")
    public ResultEntity list(TPersonEntityDto tPersonEntityDto){
        List<TPersonEntity> list = personService.list(tPersonEntityDto);
        return ResultEntity.success("200","成功",list);
    }

}

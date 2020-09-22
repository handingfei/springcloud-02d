package com.hdf.upmsbizfeign.web;

import com.hdf.dto.TCarDto;
import com.hdf.upmsbizfeign.service.CarService;
import com.hdf.vo.ResultEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

    @Autowired
    CarService carService;


    Logger logger = LoggerFactory.getLogger(UserController.class);

    @RequestMapping("/tCar/list")
    public ResultEntity userList(TCarDto tCarDto){

        ResultEntity userList = carService.list(tCarDto);

        return userList;
    }


    @RequestMapping("/tDriverType/findAll")
    public ResultEntity findAll(){

        ResultEntity all = carService.findAll();

        return all;
    }

    @RequestMapping("/tCar/list1")
    public ResultEntity userList1(TCarDto tCarDto){

        ResultEntity userList = carService.list1(tCarDto);

        return userList;
    }



}

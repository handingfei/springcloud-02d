package com.hdf.upmsbizfeign.service;

import com.hdf.dto.TCarDto;
import com.hdf.vo.ResultEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "UPMS-BIZ")
public interface CarService {

    @RequestMapping("/tCar/list")
    public ResultEntity list(@RequestBody TCarDto tCarDto);


    @RequestMapping("/tDriverType/findAll")
    public ResultEntity findAll();

    @RequestMapping("/tCar/list1")
    public ResultEntity list1(@RequestBody TCarDto tCarDto);

}

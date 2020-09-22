package com.hdf.upmsbizfeign.service;

import com.hdf.dto.TCarDto;
import com.hdf.vo.ResultEntity;
import org.springframework.stereotype.Component;

@Component
public class CarServiceFallback implements CarService{
    @Override
    public ResultEntity list(TCarDto tCarDto) {
        return ResultEntity.fail("访问失败");
    }

    @Override
    public ResultEntity findAll() {
        return ResultEntity.fail("访问失败");
    }

    @Override
    public ResultEntity list1(TCarDto tCarDto) {
        return ResultEntity.fail("访问失败");
    }

}

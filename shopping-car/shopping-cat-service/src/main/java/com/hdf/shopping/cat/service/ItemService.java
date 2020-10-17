package com.hdf.shopping.cat.service;

import com.hdf.dto.TItemDto;
import com.hdf.vo.ResultEntity;
import com.hdf.vo.TItemVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "ITEM-EUREKA")
public interface ItemService {
    @RequestMapping("/tiem/list")
    public ResultEntity findPage(TItemDto dto);
    @RequestMapping("/tiem/findById")
    public TItemVo findById(Integer id);

}

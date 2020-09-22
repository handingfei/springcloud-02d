package com.hdf.upmsbizeurekafegin.service;


import com.hdf.dto.UserDto;
import com.hdf.vo.ResultEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value="upms-biz")
public interface UserSerivce {

    @RequestMapping("/user/list")
    public ResultEntity list(@RequestBody UserDto userDto);
}

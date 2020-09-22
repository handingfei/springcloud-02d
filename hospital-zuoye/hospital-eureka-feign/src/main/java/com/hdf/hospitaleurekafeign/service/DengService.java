package com.hdf.hospitaleurekafeign.service;

import dto.DengjiDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import vo.Res;

@Component
@FeignClient(value = "UPMS-BIZ")
public interface DengService {
    @RequestMapping("/dengji/list")
    public Res list(@RequestBody DengjiDto dengjiDto);
    @RequestMapping("/dengji/klist")
    public Res klist();
    @RequestMapping("/dengji/ylist")
    public Res ylist(@RequestBody Integer id);
    @RequestMapping("/dengji/clist")
    public Res clist(@RequestBody Integer id);
    @RequestMapping("/dengji/add")
    public Res add(@RequestBody DengjiDto dengjiDto);

    @RequestMapping("/dengji/delete")
    public Res delete(@RequestBody Integer[] ids);
}

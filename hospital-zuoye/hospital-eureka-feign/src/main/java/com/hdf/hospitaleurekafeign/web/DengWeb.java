package com.hdf.hospitaleurekafeign.web;

import com.hdf.hospitaleurekafeign.service.DengService;
import dto.DengjiDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vo.Res;
@RestController
public class DengWeb {
    @Autowired
    DengService dengService;
    @RequestMapping("/dengji/list")
    public Res  list(DengjiDto dengjiDto){
        return  dengService.list(dengjiDto);
    }
    @RequestMapping("/dengji/klist")
    public Res  klist(){
        return  dengService.klist();
    }
    @RequestMapping("/dengji/ylist")
    public Res  ylist(Integer id){
        return  dengService.ylist(id);
    }
    @RequestMapping("/dengji/clist")
    public Res  clist(Integer id){
        return  dengService.clist(id);
    }
    @RequestMapping("/dengji/add")
    public Res add(@RequestBody DengjiDto dengjiDto){
        System.err.println("f+========"+dengjiDto);
        return  dengService.add(dengjiDto)
                ;
    }

    @RequestMapping("/dengji/delete")
    public Res delete(@RequestBody Integer[] ids){
        return dengService.delete(ids);
    }
}

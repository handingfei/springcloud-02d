package com.hdf.hospitaleurekaclient.web;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hdf.hospitaleurekaclient.entity.Dengji;
import com.hdf.hospitaleurekaclient.service.IChuangweiService;
import com.hdf.hospitaleurekaclient.service.IDengjiService;
import com.hdf.hospitaleurekaclient.service.IKeshiService;
import com.hdf.hospitaleurekaclient.service.IYishengService;
import dto.DengjiDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import vo.Res;

import java.util.Arrays;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 贾俊伟
 * @since 2020-09-18
 */
@RestController
@RequestMapping("/dengji")
public class DengjiController {

    @Autowired
    IDengjiService iDengjiService;
    @Autowired
    IKeshiService iKeshiService;
    @Autowired
    IYishengService iYishengService;
    @Autowired
    IChuangweiService iChuangweiService;

    @RequestMapping("/list")
    public Res  list(@RequestBody DengjiDto dengjiDto){
        PageHelper.startPage(dengjiDto.getPageNo(),dengjiDto.getPageSize());
        List<Dengji> dlist = iDengjiService.dlist(dengjiDto);
        PageInfo  pageInfo=new PageInfo(dlist);
        return Res.suess("200","成功",pageInfo);
    }
    @RequestMapping("/klist")
    public Res klist(){
        return Res.suess("200","成功",iKeshiService.selectList(null));
    }

    @RequestMapping("/ylist")
    public Res ylist(@RequestBody Integer id){
        Wrapper wrapper=new EntityWrapper();
        wrapper.eq("kid",id);
      return   Res.suess("200","医生列表",iYishengService.selectList(wrapper));
    }

    @RequestMapping("/clist")
    public Res clist(@RequestBody Integer id){
        Wrapper wrapper=new EntityWrapper();
        wrapper.eq("kid",id);
        return   Res.suess("200","床位列表",iChuangweiService.selectList(wrapper));
    }

    @RequestMapping("/add")
    public Res add(@RequestBody DengjiDto dengjiDto){
        Dengji dengji=new Dengji();
        BeanUtils.copyProperties(dengjiDto,dengji);
       // dengji.setName(dengjiDto.getName());
        System.err.println(dengji+"============dto"+dengjiDto);
       return Res.suess("200","添加成功",this.iDengjiService.insertOrUpdate(dengji));
    }

    @RequestMapping("/delete")
    public Res delete(@RequestBody Integer[] ids){

        boolean b = iDengjiService.deleteBatchIds(Arrays.asList(ids));

        return Res.suess("200","删除成功",b);
    }

}

package com.hdf.carrclient.web;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hdf.carrclient.entity.TCarr;
import com.hdf.carrclient.service.ITCarrService;
import com.hdf.dto.TCarrDto;
import com.hdf.vo.Res;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * InnoDB free: 7168 kB 前端控制器
 * </p>
 *
 * @author handingfei
 * @since 2020-09-28
 */
@RestController
@RequestMapping("/tCarr")
public class TCarrController {

    @Autowired
    ITCarrService itCarrService;

    /**
     * 页面
     * @param tCarr
     * @return
     */
    @RequestMapping("/list")
    public Res list(@RequestBody TCarr tCarr){

        List<TCarr> list = itCarrService.carlist(tCarr);
        return Res.suess("200","成功",list);
    }



}

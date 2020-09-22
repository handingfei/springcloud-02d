package com.handingfei.dingdanprovide.web;


import com.handingfei.dingdanprovide.entity.Dingdan;
import com.handingfei.dingdanprovide.service.IDingdanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * <p>
 * InnoDB free: 7168 kB 前端控制器
 * </p>
 *
 * @author Mht
 * @since 2020-09-14
 */
@Controller
@RequestMapping("/dingdan")
public class DingdanController {

    @Autowired
    IDingdanService iDingdanService;

    /**
     * 调动接口服务
     * @return
     */
    @RequestMapping("/list")
    public List<Dingdan> list(){
        List<Dingdan> dingdans = iDingdanService.list();

        System.out.println(dingdans);
        return dingdans;
    }

}

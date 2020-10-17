package com.hdf.eurekajpamongodb.controller;

import com.hdf.eurekajpamongodb.entity.Clazz;
import com.hdf.eurekajpamongodb.service.IClazzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ClazzController {

    @Autowired
    IClazzService iClazzService;

    /**
     * 列表
     * @param clazz
     * @return
     */
    @RequestMapping("/clazz/list")
    public String list(Clazz clazz){

        List<Clazz> list = iClazzService.list(clazz);

        return "list";
    }

    /**
     * 新加
     * @param clazz
     * @return
     */
    @RequestMapping("/clazz/save")
    public boolean save(Clazz clazz){

        boolean flag = iClazzService.save(clazz);

        return flag;
    }

    /**
     * 修改
     * @param id
     * @return
     */
    @RequestMapping("/clazz/update")
    public boolean update(Integer id){

        boolean flag = iClazzService.update(id);
        return flag;
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @RequestMapping("/clazz/delete")
    public boolean delete(Integer id){

        boolean flag = iClazzService.delete(id);
        return flag;
    }

}

package com.hdf.jxcbiz.web;


import com.qpx.jxcbiz.entity.TMenu;
import com.qpx.jxcbiz.entity.TRole;
import com.qpx.jxcbiz.entity.TUser;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Mht
 * @since 2020-03-02
 */
@Controller
@RequestMapping("/tUser")
public class TUserController {


    @RequestMapping("/user")
    @ResponseBody
    public TUser tUser(@RequestBody TUser tUser){
        //查询数据库组装数据
        TUser tUser1 = null;
        TRole tRole = new TRole();//设置或者查role
        tUser1.setRole(tRole);
        TMenu tMenu = new TMenu();//设置或者查询TMenu
        tUser1.setMenu(tMenu);
        return  tUser1;
    }
}

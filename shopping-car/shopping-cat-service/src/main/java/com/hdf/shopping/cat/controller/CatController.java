package com.hdf.shopping.cat.controller;

import com.alibaba.fastjson.JSON;
import com.hdf.dto.CatDto;
import com.hdf.dto.UserDto;
import com.hdf.shopping.cat.service.CatService;
import com.hdf.shopping.cat.service.ItemService;
import com.hdf.vo.ResultEntity;
import com.hdf.vo.TItemVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.util.Map;

@RestController
public class CatController {
    @Autowired
    CatService catService;

    @Autowired
    ItemService itemService;

    @RequestMapping("/cat/list")
    public ResultEntity list(CatDto catDto, HttpSession session){
        Object user = session.getAttribute("user");
        if(user==null){
           return ResultEntity.fail("请先登录");
        }
        catDto.setUserID(((UserDto)user).getId());
        System.err.println(JSON.toJSONString(catDto)+"con");
        Map<String, Object> page = catService.findPage(catDto);
        return ResultEntity.success("200","成功",page);

    }

    @RequestMapping("/cat/save")
    public ResultEntity save(CatDto catDto, HttpSession session){
        Object user = session.getAttribute("user");
        if (user==null){
            return ResultEntity.fail("401","尚未登录，请重修登录",null);
        }
        TItemVo byID = itemService.findById(catDto.getItemID());

        if (byID==null){
            return ResultEntity.fail("商品不存在");
        }
        catDto.setItemPrice(BigDecimal.valueOf(byID.getItemPrice()));
        catDto.setTotal(catDto.getItemPrice().multiply(new BigDecimal(catDto.getItemNumber())));
        catDto.setUserID(((UserDto)user).getId());
        catService.save(catDto);
        return  ResultEntity.success();
    }


    @RequestMapping("/cat/update")
    public ResultEntity update(CatDto catDto,HttpSession session){
        Object user = session.getAttribute("user");
        if (user==null){
            return ResultEntity.fail("401","尚未登录，请重修登录",null);
        }
        TItemVo byID = itemService.findById(catDto.getItemID());
        if (byID==null){
            return ResultEntity.fail("商品不存在");
        }
        catDto.setItemPrice(BigDecimal.valueOf(byID.getItemPrice()));
        catDto.setTotal(new BigDecimal(byID.getItemPrice()).multiply(new BigDecimal(catDto.getItemNumber())));
        catDto.setUserID(((UserDto)user).getId());
        catService.update(catDto);
        return ResultEntity.fail();
    }

    @RequestMapping("/cat/del")
    public ResultEntity del(CatDto catDto,HttpSession session){
        Object user = session.getAttribute("user");
        if (user==null){
            return ResultEntity.fail("401","尚未登录，请重修登录",null);
        }
        catDto.setUserID(((UserDto)user).getId());
        catService.del(catDto);
        return ResultEntity.success();
    }

}

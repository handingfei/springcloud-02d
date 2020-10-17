package com.handingfei.eurekajpa.controller;

import com.handingfei.dto.TCarEntityDto;
import com.handingfei.eurekajpa.entity.TCarEntity;
import com.handingfei.eurekajpa.service.TCarService;
import com.handingfei.vo.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TCarController {

    @Autowired
    TCarService tCarService;

    /**
     * 列表
     * @param tCarEntityDto
     * @return
     */
    @RequestMapping("/car/list")
    public ResultEntity list(TCarEntityDto tCarEntityDto){

        Page<TCarEntity> page = tCarService.getPage(tCarEntityDto);

        return ResultEntity.success("200","成功",page);
    }

    /**
     * 添加
     * @param carEntityDto
     * @return
     */
    @RequestMapping("/car/save")
    public boolean save(@RequestBody TCarEntity carEntityDto){

        return tCarService.add(carEntityDto);
    }

    /**
     * 删除
     * @param ids
     * @return
     */
    @RequestMapping("/car/delete")
    public ResultEntity delete(Integer[] ids){
        tCarService.delete(ids);
        return ResultEntity.success("200","成功");
    }


}

package com.hdf.jxcbiz.web;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qpx.jxc.common.dto.GoodsDto;
import com.qpx.jxc.common.utils.ExcelUtils;
import com.qpx.jxc.common.vo.ResultEntity;
import com.qpx.jxcbiz.entity.TGoods;
import com.qpx.jxcbiz.service.ITGoodsService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.apache.poi.hssf.record.formula.functions.T;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Mht
 * @since 2020-03-02
 */
@RestController
@RequestMapping("/biz/tGoods")
@Slf4j
public class TGoodsController {


    @Autowired
    ITGoodsService itGoodsService;

    @RequestMapping("/getGoodsPage")
    public ResultEntity getGoodsPage(GoodsDto goodsDto){
        PageHelper.startPage(goodsDto.getPageNo(),goodsDto.getPageSize());
        Wrapper wrapper = new EntityWrapper();
        if (StringUtils.isNotBlank(goodsDto.getName())){
            wrapper.like("name",goodsDto.getName());
        }
        List<TGoods> list = itGoodsService.selectList(wrapper);
        PageInfo<TGoods> pageInfo  = new PageInfo<TGoods>(list);
        return ResultEntity.ok(pageInfo);
    }

    @RequestMapping("/downLoadGoodsExcel")
    public ResponseEntity downLoadGoodsExcel(GoodsDto goodsDto) throws Exception {

        XSSFWorkbook xSSFWorkbooks = itGoodsService.downLoadGoodsExcel(goodsDto);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        xSSFWorkbooks.write(byteArrayOutputStream);

        HttpHeaders httpHeaders =  new HttpHeaders();
        httpHeaders.setContentDispositionFormData("attachment", new String("商品表.xlsx".getBytes("UTF-8"), "ISO-8859-1"));
        httpHeaders.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        return new ResponseEntity(byteArrayOutputStream.toByteArray(),httpHeaders, HttpStatus.CREATED);

    }


    @RequestMapping("/upLoadExcel")
    public ResultEntity  upLoadExcel(MultipartFile file) throws Exception {
        if (file == null){
           throw new Exception("文件为空");
        }
        String fileType = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));

        try {
            this.itGoodsService.uplodExcel(file);
        }catch (Exception e){
            e.printStackTrace();
            log.error(e.getMessage());
            throw new Exception("导入数据失败");
        }
        return ResultEntity.ok("导入数据成功");
    }



}

package com.hdf.jxcbiz.service;

import com.hdf.jxcbiz.entity.TGoods;
import com.baomidou.mybatisplus.service.IService;
import org.springframework.web.multipart.MultipartFile;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Mht
 * @since 2020-03-02
 */
public interface ITGoodsService extends IService<TGoods> {

    XSSFWorkbook downLoadGoodsExcel(GoodsDto goodsDto) throws Exception;

    void uplodExcel(MultipartFile multipartFile) throws Exception;
}

package com.hdf.jxcbiz.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qpx.jxc.common.dto.GoodsDto;
import com.qpx.jxc.common.utils.ExcelBean;
import com.qpx.jxc.common.utils.ExcelUtils;
import com.qpx.jxcbiz.entity.TGoods;
import com.qpx.jxcbiz.mapper.TGoodsMapper;
import com.qpx.jxcbiz.service.ITGoodsService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Mht
 * @since 2020-03-02
 */
@Service
@Slf4j
public class TGoodsServiceImpl extends ServiceImpl<TGoodsMapper, TGoods> implements ITGoodsService {

    @Override
    public XSSFWorkbook downLoadGoodsExcel(GoodsDto goodsDto) throws Exception {
        log.info("下单开始 生成的订单号是：{}，单价是{},购买数量是{}.支付折扣{},活动折扣{},优惠卷扣减,积分抵扣{}，快递费:{}","1234567","255","2");
        PageHelper.startPage(goodsDto.getPageNo(),goodsDto.getPageSize());
        Wrapper wrapper = new EntityWrapper();

        if (StringUtils.isNotBlank(goodsDto.getName())){
            wrapper.like("name",goodsDto.getName());
        }
        List<TGoods> list = this.selectList(wrapper);
        PageInfo<TGoods> pageInfo = new PageInfo(list);
        Map<Integer,List<ExcelBean>> map = new HashMap<Integer,List<ExcelBean>>();
        List<ExcelBean> excelBeans = new ArrayList<>();
        excelBeans.add(new ExcelBean("id","id",0));
        excelBeans.add(new ExcelBean("商品名称","name",0));
        excelBeans.add(new ExcelBean("商品代码","code",0));
        excelBeans.add(new ExcelBean("库存","inventoryQuantity",0));
        excelBeans.add(new ExcelBean("商品样式","model",0));
        excelBeans.add(new ExcelBean("生产商","producer",0));
        excelBeans.add(new ExcelBean("采购价格","purchasingPrice",0));
        excelBeans.add(new ExcelBean("销售价格","sellingPrice",0));
        excelBeans.add(new ExcelBean("最后成交价","lastPurchasingPrice",0));

        excelBeans.add(new ExcelBean("单位","unit",0));
        excelBeans.add(new ExcelBean("状态","stateStr",0));
        map.put(0,excelBeans);

        return ExcelUtils.createExcelFile(TGoods.class,pageInfo.getList(),map,"商铺列表");
    }

    @Override
    public void uplodExcel(MultipartFile multipartFile) throws Exception {
        List<List<Object>> bankListByExcel = ExcelUtils.getBankListByExcel(multipartFile.getInputStream(), multipartFile.getOriginalFilename());
        List<TGoods> list = new ArrayList<>();

        for (List<Object> objects : bankListByExcel) {
            TGoods goods = new TGoods();
            goods.setName(objects.get(1).toString());
            goods.setCode(objects.get(2).toString());
            goods.setInventoryQuantity(Integer.valueOf(objects.get(3).toString()));
            goods.setModel(objects.get(4).toString());
            goods.setProducer(objects.get(5).toString());
            goods.setPurchasingPrice(Float.valueOf(objects.get(6).toString()));
            goods.setSellingPrice(Float.valueOf(objects.get(7).toString()));
            goods.setLastPurchasingPrice(Float.valueOf(objects.get(8).toString()));
            goods.setUnit(objects.get(9).toString());
            goods.setState(objects.get(10).toString().equals("上架")?2:0);
            goods.setMinNum(100);
            list.add(goods);
        }
        this.insertBatch(list);
    }
}

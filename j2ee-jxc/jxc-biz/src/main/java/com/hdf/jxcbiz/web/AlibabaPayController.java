package com.hdf.jxcbiz.web;


import com.alipay.api.AlipayApiException;
import com.alipay.api.response.AlipayTradePrecreateResponse;
import com.qpx.jxc.common.vo.ResultEntity;
import com.qpx.jxc.pay.alibaba.qrcode.service.AlibabapayQrCodeService;
import com.qpx.jxcbiz.service.AlibabaPayService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/biz/alibaba/pay")
@Slf4j
public class AlibabaPayController {

    @Autowired
    AlibabapayQrCodeService alibabapayQrCodeService;

    @Autowired
    AlibabaPayService alibabaPayService;

    @Autowired
    RedisTemplate<String,String> redisTemplate;
    @RequestMapping("/createPayOrder")
    public  ResultEntity createPayOrder(String orderNo) throws AlipayApiException {

        log.info("创建支付宝扫码订单开始订单号为:{}",orderNo);
        if(redisTemplate.hasKey(orderNo)){
            String qrcode = redisTemplate.opsForValue().get(orderNo);
            log.info("根据orderNo:{}到redis 中查询二维码:{}",orderNo,qrcode);
            return ResultEntity.ok("创建支付宝扫码支付订单成功",qrcode);
        }
        log.info("根据orderNo:{}到redis 中查询二维码不存在开始调用支付宝的接口创建预支付订单......");
        Map<String,String> map = new HashMap<>();
        map.put("out_trade_no",orderNo);
        map.put("trade_no",orderNo);
        map.put("total_amount","0.01");
        map.put("subject","Iphone6 16G");
        //商家id
        map.put("store_id","2088102180157670");
        map.put("timeout_express","7200m");
        AlipayTradePrecreateResponse qrCodePayOrder = alibabapayQrCodeService.createQrCodePayOrder(map);
        String qrcode = alibabaPayService.getAlibabaPayQRCode(qrCodePayOrder);
        log.info("创建支付宝扫码订单结束订单号为:{}",orderNo);
        return ResultEntity.ok("创建支付宝扫码支付订单成功",qrcode);
    }
}

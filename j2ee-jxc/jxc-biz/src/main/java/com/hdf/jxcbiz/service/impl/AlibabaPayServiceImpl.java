package com.hdf.jxcbiz.service.impl;

import com.alipay.api.response.AlipayTradePrecreateResponse;
import com.qpx.jxcbiz.service.AlibabaPayService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
@Component
@Configuration
@Slf4j
public class AlibabaPayServiceImpl implements AlibabaPayService {


    @Autowired
    StringRedisTemplate StringRedisTemplate;

    @Override
    public String getAlibabaPayQRCode(AlipayTradePrecreateResponse qrCodePayOrder) {
        StringRedisTemplate.opsForValue().set(qrCodePayOrder.getOutTradeNo(),qrCodePayOrder.getQrCode(),3600, TimeUnit.SECONDS);
        return StringRedisTemplate.opsForValue().get(qrCodePayOrder.getOutTradeNo());
    }
}

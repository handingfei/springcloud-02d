package com.hdf.jxcbiz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.qpx.jxcbiz.mapper")
public class JxcBizApplication {

    public static void main(String[] args) {
        SpringApplication.run(JxcBizApplication.class, args);
    }

}

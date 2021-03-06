package com.hdf.upmsbizeureka;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.hdf.upmsbizeureka.mapper")
public class UpmsBizEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(UpmsBizEurekaApplication.class, args);
    }

}

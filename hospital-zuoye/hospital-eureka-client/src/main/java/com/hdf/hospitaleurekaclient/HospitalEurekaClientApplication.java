package com.hdf.hospitaleurekaclient;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(basePackages = "com.hdf.hospitaleurekaclient.mapper")
public class HospitalEurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(HospitalEurekaClientApplication.class, args);
    }

}

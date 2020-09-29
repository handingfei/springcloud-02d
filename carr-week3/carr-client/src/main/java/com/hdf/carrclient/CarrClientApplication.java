package com.hdf.carrclient;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(basePackages = "com.hdf.carrclient.mapper")
public class CarrClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarrClientApplication.class, args);
    }

}

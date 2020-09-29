package com.hdf.hospitaleurekaclient;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.config.EmbeddedValueResolver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
@MapperScan(basePackages = "com.hdf.hospitaleurekaclient.mapper")
public class HospitalEurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(HospitalEurekaClientApplication.class, args);
    }



}

package com.hdf.upms.biz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class UpmsBizNacosApplication {

    public static void main(String[] args) {
        SpringApplication.run(UpmsBizNacosApplication.class, args);
    }

}

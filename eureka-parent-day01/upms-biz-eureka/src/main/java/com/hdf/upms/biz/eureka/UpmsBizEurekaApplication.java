package com.hdf.upms.biz.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class UpmsBizEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(UpmsBizEurekaApplication.class, args);
    }

}

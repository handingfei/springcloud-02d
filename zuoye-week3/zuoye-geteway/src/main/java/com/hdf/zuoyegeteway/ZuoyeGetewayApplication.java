package com.hdf.zuoyegeteway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ZuoyeGetewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuoyeGetewayApplication.class, args);
    }

}

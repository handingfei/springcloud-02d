package com.hdf.hospitaleurekageteway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class HospitalEurekaGetewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(HospitalEurekaGetewayApplication.class, args);
    }

}

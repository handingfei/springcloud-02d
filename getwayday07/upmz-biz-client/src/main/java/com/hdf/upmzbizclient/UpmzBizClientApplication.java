package com.hdf.upmzbizclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.stereotype.Component;

@SpringBootApplication
@EnableDiscoveryClient
public class UpmzBizClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(UpmzBizClientApplication.class, args);
    }

}

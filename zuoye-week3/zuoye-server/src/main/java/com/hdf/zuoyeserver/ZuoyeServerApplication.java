package com.hdf.zuoyeserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ZuoyeServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuoyeServerApplication.class, args);
    }

}

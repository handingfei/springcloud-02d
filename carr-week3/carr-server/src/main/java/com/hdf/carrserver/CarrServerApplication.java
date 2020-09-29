package com.hdf.carrserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CarrServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarrServerApplication.class, args);
    }

}

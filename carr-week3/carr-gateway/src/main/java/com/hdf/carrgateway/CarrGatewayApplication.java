package com.hdf.carrgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CarrGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarrGatewayApplication.class, args);
    }

}

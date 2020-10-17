package com.lianxi.eurekajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaJpaApplication.class, args);
    }

}

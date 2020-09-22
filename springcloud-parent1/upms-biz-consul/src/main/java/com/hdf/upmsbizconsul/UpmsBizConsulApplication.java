package com.hdf.upmsbizconsul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class UpmsBizConsulApplication {

    public static void main(String[] args) {
        SpringApplication.run(UpmsBizConsulApplication.class, args);
    }

}

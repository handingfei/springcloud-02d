package com.hdf.confignacosclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@CacheConfig
public class ConfigNacosClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigNacosClientApplication.class, args);
    }

}

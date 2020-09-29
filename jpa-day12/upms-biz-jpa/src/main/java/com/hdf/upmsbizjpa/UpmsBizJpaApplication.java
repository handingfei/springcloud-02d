package com.hdf.upmsbizjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class UpmsBizJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(UpmsBizJpaApplication.class, args);
    }

}

package com.hdf.zuoyejpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class ZuoyeJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuoyeJpaApplication.class, args);
    }

}

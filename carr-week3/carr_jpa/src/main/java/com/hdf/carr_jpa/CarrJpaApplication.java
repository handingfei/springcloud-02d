package com.hdf.carr_jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class CarrJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarrJpaApplication.class, args);
    }

}

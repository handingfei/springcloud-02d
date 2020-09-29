package com.hdf.jpaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class JpaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaServerApplication.class, args);
    }

}

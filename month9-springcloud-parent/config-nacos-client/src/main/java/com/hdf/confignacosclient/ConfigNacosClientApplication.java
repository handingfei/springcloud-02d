package com.hdf.confignacosclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RefreshScope
public class ConfigNacosClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigNacosClientApplication.class, args);
    }

    @Value("${server.port}")
    public String port;

    @RequestMapping("/nacos/config/test")
    public Object test(){
        return port;
    }

}

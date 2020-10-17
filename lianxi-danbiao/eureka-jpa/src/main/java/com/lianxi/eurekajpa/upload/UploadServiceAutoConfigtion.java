package com.lianxi.eurekajpa.upload;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(UploadProperties.class)
@ConditionalOnClass(UploadProperties.class)
public class UploadServiceAutoConfigtion {

    @Autowired
    private UploadProperties uploadProperties;

    @Bean
    public UploadService uploadService(){
        return new UploadService(uploadProperties);
    }
}

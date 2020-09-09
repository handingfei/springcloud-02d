package com.hdf.upms.biz.eureka.client;

import com.netflix.loadbalancer.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class UpmsBizEurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(UpmsBizEurekaClientApplication.class, args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @Bean
    public IRule myRule(){

        //return new RandomRule();
//        return new RoundRobinRule();
//        return new RetryRule();
//         return new WeightedResponseTimeRule();
//        return new PredicateBasedRule();

        return new BestAvailableRule();
    }




}

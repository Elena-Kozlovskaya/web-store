package com.kozlovskaya.store.front;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FrontApp {
    public static void main(String[] args){
        SpringApplication.run(FrontApp.class, args);
    }
}

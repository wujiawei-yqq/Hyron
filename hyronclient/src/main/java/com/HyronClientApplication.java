package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class HyronClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(HyronClientApplication.class, args);
    }
}

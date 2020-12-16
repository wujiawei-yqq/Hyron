package com.baomidou.ant;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@MapperScan(basePackages = "com.baomidou.ant.admin.mapper")
public class BokeApplication {
    public static void main(String[] args) {
        SpringApplication.run(BokeApplication.class, args);
    }
}
package com.sumao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
 @Description: 注册中心
 */
@SpringBootApplication
@EnableEurekaServer // 声明这个应用是一个EurekaServer
public class ScRegistry {

    public static void main(String[] args) {
        SpringApplication.run(ScRegistry.class, args);
    }
}


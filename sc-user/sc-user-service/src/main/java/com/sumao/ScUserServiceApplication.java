package com.sumao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableDiscoveryClient // 开启EurekaClient功能
@MapperScan("com.sumao.user.mapper")
public class ScUserServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ScUserServiceApplication.class);
    }
}

package com.sumao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author Mr.z
 * @create 2020-02-10-14:16
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy // 开启Zuul的网关功能
public class ZuulDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulDemoApplication.class, args);
    }
}

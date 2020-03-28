package com.sumao.user.client;


import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Mr.z
 * @create 2020-02-10-13:49
 */
@FeignClient("sc-user-service")
public interface UserFeignClient {

    @GetMapping("/user/{id}")
    SecurityProperties.User queryUserById(@PathVariable("id") Long id);
}

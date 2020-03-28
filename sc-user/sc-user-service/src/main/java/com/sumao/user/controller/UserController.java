package com.sumao.user.controller;

import com.sumao.user.pojo.User;
import com.sumao.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Mr.z
 * @create 2020-02-07-16:08
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public User queryById(@PathVariable("id") Long id) {
        User user = this.userService.queryById(id);
        System.out.println(user);
        return user;
    }
    @GetMapping("login/{username}/{password}")
    public String login(@PathVariable("username") String username,
                        @PathVariable("password") String password){
        System.out.println(username+"-------"+password);
        return "1";
    }
}

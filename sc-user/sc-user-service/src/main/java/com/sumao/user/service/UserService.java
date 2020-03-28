package com.sumao.user.service;

import com.sumao.user.mapper.UserMapper;
import com.sumao.user.pojo.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Mr.z
 * @create 2020-02-07-16:10
 */
@Service
public class UserService {

    @Resource
    private UserMapper userMapper;

    public User queryById(Long id) {
        return this.userMapper.selectByPrimaryKey(id);
    }
}

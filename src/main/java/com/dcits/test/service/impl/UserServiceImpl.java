package com.dcits.test.service.impl;

import com.dcits.test.mapper.UserMapper;
import com.dcits.test.model.User;
import com.dcits.test.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Qisong
 * 2021/1/2
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public int saveCreateUser(User user) {
        return userMapper.insertUser(user);
    }
}

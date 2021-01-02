package com.dcits.test.service;

import com.dcits.test.model.User;

/**
 * Qisong
 * 2021/1/2
 */
public interface UserService {
    /**
     * 保存用户信息
     * @return
     */
    int saveCreateUser(User user);
}

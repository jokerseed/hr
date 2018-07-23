package com.example.liuquan.service.impl;

import com.example.liuquan.dao.UserDao;
import com.example.liuquan.entity.User;
import com.example.liuquan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public int login(User user) {
        return userDao.findByNameAndPassword(user);
    }
}

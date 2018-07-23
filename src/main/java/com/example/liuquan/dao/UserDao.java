package com.example.liuquan.dao;

import com.example.liuquan.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {
    public int findByNameAndPassword(User user);
}

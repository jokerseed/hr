package com.example.liuquan.controller;

import com.example.liuquan.entity.User;
import com.example.liuquan.service.impl.UserServiceImpl;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@EnableAutoConfiguration
@RequestMapping("all")
@Controller
public class ControllerForAll {
    @Resource(name="userService")
    private UserServiceImpl userService;

    @RequestMapping("login")
    public String login(String username_login,String password_login){   
        User user=new User();
        user.setUser_name(username_login);
        user.setUser_password(password_login);
        int index=userService.login(user);
        if(index>0){
            System.out.println("success");
            System.out.println(index);
        }
        return "";
    }
}

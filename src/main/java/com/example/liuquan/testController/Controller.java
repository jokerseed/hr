package com.example.liuquan.testController;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {
    @RequestMapping("/test")
    public String test(){
        return "test";
    }
}

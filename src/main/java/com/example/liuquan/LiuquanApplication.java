package com.example.liuquan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
@EnableTransactionManagement
@SpringBootApplication
public class LiuquanApplication {
    public static void main(String[] args) {
        SpringApplication.run(LiuquanApplication.class, args);
    }
}

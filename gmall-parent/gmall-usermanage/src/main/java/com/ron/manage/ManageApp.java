package com.ron.manage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.ron.manage.mapper")
public class ManageApp {
    public static void main(String[] args) {
        SpringApplication.run(ManageApp.class, args);
    }
}

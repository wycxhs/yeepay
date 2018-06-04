package com.yeepay.web;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = {
        "com.yeepay.service",
        "com.yeepay.web",
        "com.yeepay.common",
        "com.yeepay.dao",
})

public class Application {

    public static void main(String[] args) throws Exception {

        ApplicationContext context = SpringApplication.run(Application.class, args);

    }
}

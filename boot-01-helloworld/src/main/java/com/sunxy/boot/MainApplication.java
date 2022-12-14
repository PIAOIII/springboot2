package com.sunxy.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 主程序类
 * @SpringBootApplication: 这是一个springboot应用
 */
@SpringBootApplication
public class MainApplication {

    public static void main(String[] args){
        SpringApplication.run(MainApplication.class, args)
    }
}

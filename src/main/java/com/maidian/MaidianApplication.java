package com.maidian;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.maidian.mapper")
//@ComponentScan("com.maidian.service")
public class MaidianApplication {

    public static void main(String[] args) {
        SpringApplication.run(MaidianApplication.class, args);
    }

}

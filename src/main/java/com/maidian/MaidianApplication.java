package com.maidian;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.maidian")
public class MaidianApplication {

    public static void main(String[] args) {
        SpringApplication.run(MaidianApplication.class, args);
    }

}

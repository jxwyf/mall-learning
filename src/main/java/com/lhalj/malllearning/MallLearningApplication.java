package com.lhalj.malllearning;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com/lhalj/malllearning/mbg/mapper")
public class MallLearningApplication {


    public static void main(String[] args) {
        SpringApplication.run(MallLearningApplication.class, args);
    }

}

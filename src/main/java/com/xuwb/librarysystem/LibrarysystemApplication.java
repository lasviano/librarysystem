package com.xuwb.librarysystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xuwb.librarysystem.mappers")
public class LibrarysystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(LibrarysystemApplication.class, args);
    }

}

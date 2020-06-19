package com.woniu.housemanager;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.woniu.housemanager.mapper")
public class HousemanagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HousemanagerApplication.class, args);
    }
}

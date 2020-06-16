package com.woniu.housemanager;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;

import javax.servlet.MultipartConfigElement;

@SpringBootApplication
@MapperScan("com.woniu.housemanager.mapper")
public class HousemanagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HousemanagerApplication.class, args);
    }

    @Bean
    MultipartConfigElement multipartConfigElement() {
        MultipartConfigFactory factory = new MultipartConfigFactory();
        factory.setLocation("F:\\springboot-tomcat-tmp");
        return factory.createMultipartConfig();
    }

}

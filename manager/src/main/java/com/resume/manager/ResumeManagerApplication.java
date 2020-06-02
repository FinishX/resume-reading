package com.resume.manager;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
//@ComponentScan(basePackages = "com.resume")
@MapperScan(value = "com.resume.mapper")
@ComponentScan(basePackages = {"com.resume.manager","com.resume.service","com.resume.common"})
@EnableAspectJAutoProxy(exposeProxy = true)
public class ResumeManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ResumeManagerApplication.class, args);
    }

}

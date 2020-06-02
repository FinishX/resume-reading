package com.resume.manager.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @ClassName MyWebConfig
 * @Description
 * @Author yellow Machine
 * @Date2020/5/18 15:03
 * @Version V1.0
 **/
@Configuration
public class MyWebConfig implements WebMvcConfigurer {

    @Bean
    public MyInterceptor getMyInterceptor(){
        return new MyInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(getMyInterceptor());
    }
}

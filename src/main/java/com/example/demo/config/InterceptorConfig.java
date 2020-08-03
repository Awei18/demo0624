package com.example.demo.config;

import com.example.demo.entity.User;
import com.example.demo.interceptor.MyFirstInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Description
 * @Author Zhang Hongwei
 * @Date 2020/6/29 9:38
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    /*@Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(getMyFirstInterceptor(user())).addPathPatterns("/**");
    }

    //@Bean
    *//*public User user(){
       // return new User(1L, "zhanghongwewi", 18, "565633877@qq.com");
    }*//*

    @Bean
     public MyFirstInterceptor getMyFirstInterceptor(User user){
        System.out.println(user.toString()+"sddcdscdas");
        return new MyFirstInterceptor();
    }*/
}

package com.example.demo.controller;


import com.example.demo.entity.User;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.Calendar;
import java.util.Date;

/**
 * @Description
 * @Author Zhang Hongwei
 * @Date 2020/6/29 9:43
 */
@RestController
public class MyController {

    @GetMapping("/hello")
    public String hello(){
        String ret = "hello world";
        Calendar cal = Calendar.getInstance();
        System.out.println("hhha");
        return ret + "日期：" + cal.toString();
    }

    @GetMapping("/threadTest")
    public String hello2(){
        return Thread.currentThread().toString();
    }

    @GetMapping("/cookieTest")
    public String cookieTest(HttpServletResponse response){
        Cookie cookie = new Cookie("id", "123");
        cookie.setPath("/cookieTest");
        response.addCookie(cookie);
        return "cookie已创建";
    }

    @PostMapping("/getDate")
    public String getDate(@RequestBody User user){
        System.out.println(user.getDate());
        return user.toString();
    }
}

package com.example.demo.controller;


import com.example.demo.constant.DayConstant;
import com.example.demo.entity.User;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
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
    public String hello( String s){
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
    public String getDate(@RequestBody User user) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = simpleDateFormat.parse("2020-9-1 12:23:10");
        Date date = new Date();
        Duration.between(date.toInstant(), parse.toInstant());
        return user.toString();
    }

    @PostMapping("/haha")
    public String postTest(@RequestPart String s1, String s2){
        return DayConstant.Week.MONDAY;
    }
}

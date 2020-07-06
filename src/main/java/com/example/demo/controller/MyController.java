package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;

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
        return ret + "日期：" + cal.toString();
    }
}

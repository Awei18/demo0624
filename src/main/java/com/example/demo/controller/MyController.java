package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author Zhang Hongwei
 * @Date 2020/6/29 9:43
 */
@RestController
public class MyController {

    @GetMapping("/hello")
    public String hello(){
        return "hello world, hahaha" ;}
}

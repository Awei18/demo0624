package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

/**
 * @Description
 * @Author Zhang Hongwei
 * @Date 2020/6/29 14:42
 */
@Data
@AllArgsConstructor
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
    private Date date;
}

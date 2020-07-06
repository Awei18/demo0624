package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


/**
 * @Description
 * @Author Zhang Hongwei
 * @Date 2020/7/6 10:09
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void test01(){
        User user = userMapper.selectById(1);
        System.out.println(user);
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        Assert.assertEquals(5, userList.size());
        userList.forEach(System.out::println);
        System.out.println("111");
        System.out.println("222");
    }

    @Test
    public void test02(){

    }
}
package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.demo.config.MyConfig;
import com.example.demo.entity.User;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.ParseException;
import java.util.List;
import java.util.Map;


/**
 * @Description
 * @Author Zhang Hongwei
 * @Date 2020/7/6 10:09
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class UserMapperTest {
    @Autowired
    private MyConfig myConfig;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Test
    public void test01(){
        User user = userMapper.selectById(1);
        Page<User> page = new Page<>(1, 10);
        QueryWrapper<Object> objectQueryWrapper = new QueryWrapper<>();
        System.out.println(user);
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        Assert.assertEquals(5, userList.size());
        userList.forEach(System.out::println);
        System.out.println("111");
        System.out.println("222");
        System.out.println("vscode..");
    }

    @Test
    public void test02() throws ParseException {
        myConfig.sout();
    }
}

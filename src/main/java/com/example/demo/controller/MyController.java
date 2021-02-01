package com.example.demo.controller;


import com.example.demo.entity.User;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

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

    @GetMapping("/testJasper")
    public void postTest(HttpServletRequest request, HttpServletResponse response) throws IOException {
        /*Resource resource = new ClassPathResource("templates/testConnection.jasper");*/
        InputStream is = this.getClass().getClassLoader().getResourceAsStream("templates/testConnection.jasper");
        ServletOutputStream sos = response.getOutputStream();

        try {
            JasperPrint jasperPrint = JasperFillManager.fillReport(is, new HashMap<>(), getConnection());
            JasperExportManager.exportReportToPdfStream(jasperPrint, sos);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            sos.flush();
        }
    }

    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/girls", "root", "admin");
        return connection;
    }

    public static void main(String[] args) {

    }
}

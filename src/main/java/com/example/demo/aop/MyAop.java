package com.example.demo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @Description
 * @Author Zhang Hongwei
 * @Date 2020/8/3 14:36
 */
@Component
@Aspect
public class MyAop {
    @Pointcut("execution(* com.example.demo.controller.MyController.*(..))")
    public void myPointcut(){
    }

  /*  @Before("myPointcut()")
    public void test(){
        System.out.println("before.................");
    }

    @After("myPointcut()")
    public void afterTest(){
        System.out.println("AFTER....................");
    }*/

    @Around("myPointcut()")
    public Object aroundTest(ProceedingJoinPoint proceedingJoinPoint){
        Object ret = null;
        try {
            System.out.println(Arrays.toString(proceedingJoinPoint.getArgs()));
            ret = proceedingJoinPoint.proceed();
            System.out.println(proceedingJoinPoint.getSignature());
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return ret;
    }
}

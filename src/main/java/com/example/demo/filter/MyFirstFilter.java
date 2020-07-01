package com.example.demo.filter;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @Description
 * @Author Zhang Hongwei
 * @Date 2020/6/29 9:14
 */
@Slf4j
//@WebFilter( urlPatterns = "/*")
public class MyFirstFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("当前类：{}", this.getClass().getName());
    }

    @Override
    public void destroy() {

    }
}

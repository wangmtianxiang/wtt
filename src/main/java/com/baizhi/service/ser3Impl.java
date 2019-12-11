package com.baizhi.service;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class ser3Impl implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("打工的");
    }
}

package com.baizhi.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ser1Test {

    @Test
    public void ll() {
        ApplicationContext a= new  ClassPathXmlApplicationContext("asd.xml");
        Object ser1 =(ser1) a.getBean("ser2");
        System.out.println(ser1.getClass());
        System.out.println("222222222");
        System.out.println("222222222");
        System.out.println("222222222");
        System.out.println("222222222");
        System.out.println("3333");
    }



}
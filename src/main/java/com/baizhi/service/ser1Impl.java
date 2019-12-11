package com.baizhi.service;

public class ser1Impl implements  ser1 {
    @Override
    public void ll() {
        System.out.println("带人看房");
        //核心功能
        ser1 s =     new ser2Impl();
        s.ll();
    }
}

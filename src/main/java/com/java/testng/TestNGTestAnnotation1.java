package com.java.testng;

import org.testng.annotations.Test;

public class TestNGTestAnnotation1 {
    //    public
    @Test
    public void test() {
        System.out.println("执行测试方法");
        System.out.println("TestNGTestAnnotation1    test ");
    }

    @Test
    public void test1() {
        System.out.println("执行测试方法111");
        System.out.println("TestNGTestAnnotation1 test 1");
    }
}

package com.java.testng;

import org.testng.annotations.*;

public class TestNGTestAnnotation {
    //    public
    @BeforeSuite
    public void test() {
        System.out.println("执行测试方法BeforeSuite");
        System.out.println("加载整个项目数据");
    }

    @AfterSuite
    public void test11() {
        System.out.println("执行测试方法AfterSuite");
        System.out.println("释放资源");
    }

    @BeforeTest
    public void test1() {
        System.out.println("执行测试方法111BeforeTest");
    }
    @AfterTest
    public void test12() {
        System.out.println("执行测试方法111AfterTest");
    }
    @BeforeClass
    public void test3() {
        System.out.println("执行测试方法111BeforeClass");
    }
    @AfterClass
    public void test31() {
        System.out.println("执行测试方法111AfterClass");
    }
    @BeforeMethod
    public void eforeMethod() {
        System.out.println("执行测试方法111BeforeMethod");
    }
    @AfterMethod
    public void fterMethod() {
        System.out.println("执行测试方法111fterMethod");
    }
    @Test
    public void testt(){
        System.out.println("执行test 方法");
    }
}

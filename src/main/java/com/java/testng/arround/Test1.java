package com.java.testng.arround;

import org.testng.annotations.*;

public class Test1 {
    @BeforeSuite
    public void beforeSuit() {
        System.out.println("执行整个suite套件前执行  类 Test1  beforeSuit");
    }

    @AfterSuite
    public void afterSuit() {
        System.out.println("执行整个suite套件后执行  类 Test1  afterSuit");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("执行整个test套件前执行  类 Test1  beforeTest");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("执行整个test套件后执行  类 Test1  afterTest");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("执行整个class前执行  类 Test1  beforeClass");
    }
    @AfterClass
    public void afterClass() {
        System.out.println("执行整个类class后执行  类 Test1  afterClass");
    }
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("执行整个类中的 test方法前执行  类 Test1  BeforeMethod");
    }
    @AfterMethod
    public void afterMethod() {
        System.out.println("执行整个类中的 test 方法后 后执行  类 Test1  AfterMethod");
    }
    @Test
    public void test(){
        System.out.println("执行Test1   中 的 测试方法");
    }
}

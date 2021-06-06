package com.java.testng.day12;


import com.oracle.webservices.internal.api.message.PropertySet;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * 使用 @dataProvider 对 register(String username,String password,String type,String sex)方法 进行5次测试
 */
public class DataProviderDemo {

    @Test(dataProvider = "datas")
    public void register(String username,String password,String type,String sex) {
        System.out.println("姓名为："+username+",密码为："+password+",类型为："+type+",性别为："+sex);

    }
    @DataProvider
    public Object[][] datas(){
        Object[][] object={
                {"lily","12","数学","女"},
                {"coco","13","英语","男"},
                {"xixi","15","语文","男"},
                {"haha","16","奥数","女"},
                {"lili","18","英语","女"}
        };
        return object;
    }
}

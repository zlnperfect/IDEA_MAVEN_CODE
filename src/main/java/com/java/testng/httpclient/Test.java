package com.java.testng.httpclient;

import org.apache.http.NameValuePair;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.message.BasicNameValuePair;

import java.security.BasicPermission;
import java.util.ArrayList;
import java.util.List;

public class Test {
    @org.testng.annotations.Test
    public void test1() {
        String reUrl = "";
        //创建Post对象，以Post方式提交接口请求
        HttpPost httpPost = new HttpPost(reUrl);
        //2.准备提交参数
        List<NameValuePair> params = new ArrayList<NameValuePair>();
        BasicNameValuePair basicPermission= new BasicNameValuePair("mobilephone","16789067890");
        BasicNameValuePair basicPermission2= new BasicNameValuePair("pwd","16789067890");
        params.add(basicPermission);
        params.add(basicPermission2);

    }
}

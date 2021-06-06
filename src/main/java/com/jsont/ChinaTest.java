package com.jsont;

import com.alibaba.fastjson.JSONObject;

public class ChinaTest {
    public static void main(String[] args) {
        String str="{ \"name\": \"中国\", \"provinces\": [{ \"name\": \"黑龙江\", \"capital\": \"哈尔滨\" }, { \"name\": \"广东\", \"capital\": \"广州\" }, { \"name\": \"湖南\", \"capital\": \"长沙\" }] }\n";
        China china=JSONObject.parseObject(str,China.class);
//        System.out.println(china.getName());
//        System.out.println(china.getProvinces().get(0).get("name"));
    }
}

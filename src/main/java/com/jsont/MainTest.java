package com.jsont;

import com.alibaba.fastjson.JSONObject;

import java.util.List;
import java.util.Map;


public class MainTest {
    public static void main(String[] args) {
        String json = "{\"name\": \"张三\", \"age\": \"18\", \"score\":\"100\"}";
        Student stu=JSONObject.parseObject(json,Student.class);
        String json1 = "\t[{\"name\": \"张三\", \"age\": \"18\", \"score\":\"100\"},{\"name\": \"李四\", \"age\": \"16\", \"score\":\"100\"}]\n";
        List<Map> list=JSONObject.parseArray(json1, Map.class);
//        System.out.println(list.get(0).get("score"));
    }
}

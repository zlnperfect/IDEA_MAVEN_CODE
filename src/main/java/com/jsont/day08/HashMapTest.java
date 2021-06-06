package com.jsont.day08;

import java.util.HashMap;

public class HashMapTest {
    public static void main(String[] args) {
//        {"id":"1","mobile_phone":"13212312312","pwd":"12312312"}
        HashMap map= new HashMap();
        map.put("id","1");
        map.put("mobile_phone","13212312312");
        map.put("pwd","12312312");

        if (map.containsKey("mobile_phone")){
            System.out.println("mobile_phone的值为："+map.get("mobile_phone"));
        }else{
            System.out.println("抱歉没有 mobile_phone");
        }
    }

}

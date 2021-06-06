package com.jsont.day07;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainTest {
    /**
     *  有字符串String s = "abc,123,中国,llllll,haha";
     *  最终输出：abc：3，123：3，中国：2，llllll:6，haha:4 数字代表长度
     * @param args
     */
    public static void main(String[] args) {
        String str="abc,123,中国,llllll,haha";
        HashMap<String,Integer> map=new HashMap<String, Integer>();
        String[] strs=str.split(",");
        for(String s:strs){
            map.put(s,s.length());
        }
        for(String ss:map.keySet()){
            System.out.println(ss+":"+map.get(ss));
        }
    }
}

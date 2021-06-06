package com.jsont.day07;

public class StrTest {
    public static void main(String[] args) {
        String str="aiwozhonghua";
        char[] chars=str.toCharArray();
        String reverse="";
        for(int i=chars.length-1;i>=00;i--){
            reverse+=chars[i];
        }
        System.out.println(reverse);
    }
}

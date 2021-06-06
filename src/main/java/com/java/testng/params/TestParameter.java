package com.java.testng.params;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParameter {
    @Test
    @Parameters({"type","version"})
    public void test(String type,String version){
        System.out.println("type:"+type+"version:"+version);
    }
}

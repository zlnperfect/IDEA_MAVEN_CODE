package com.java.testng.day12;

import com.java.testng.day12.Students;
import com.jsont.day08.Student;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StudentDataProvider {
    @Test(dataProvider = "datas")
    public void register(Students student){
        System.out.println(student);
    }
    @DataProvider
    public Object[] datas(){
        Students stu1=new Students("lily","12","数学","女");
        Students stu2=new Students("coco","13","英语","男");
        Students stu3=new Students("xixi","15","语文","男");
        Students  stu4=new Students("haha","16","奥数","女");
        Students stu5=new Students("lili","18","英语","女");
        Object[] data={
            stu1,stu2,stu3,stu4,stu5
        };
        return data;
    }
}

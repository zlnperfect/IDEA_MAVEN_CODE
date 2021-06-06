package com.jsont.day08;

import com.jsont.day08.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MainTest {
    /**
     *
     * @param args
     * 两个班级 1801，1802
     *
     * 1801 :
     *         A :{name:-,age:-,gender:-}
     *         B
     *         C
     * 1802
     *         D
     *         E
     *
     *
     */
    public static void main(String[] args) {
        HashMap<String, ArrayList<Student>> map=new HashMap<String, ArrayList<Student>>();

        ArrayList<Student> class1801=new ArrayList<Student>();
        ArrayList<Student> class1802=new ArrayList<Student>();
        Student stuA=new Student("张三",25,'男');
        Student stuB=new Student("李四",26,'男');
        Student stuC=new Student("小花",27,'女');
        Student stuD =new Student("小明",28,'男');
        Student stuE=new Student("小红",29,'女');
        class1801.add(stuA);
        class1801.add(stuB);
        class1801.add(stuC);
        class1802.add(stuC);
        class1802.add(stuD);

        map.put("1801",class1801);
        map.put("1802",class1802);

        for (String str: map.keySet()){
            System.out.print(str);
            for(Student stu:map.get(str)){
                System.out.print(stu);
            }
            System.out.println();
        }



    }
}

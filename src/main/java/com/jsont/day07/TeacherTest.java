package com.jsont.day07;

import javax.jnlp.ClipboardService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TeacherTest {
    public static void main(String[] args) {
        Teacher t1=new Teacher();
        t1.setName("张三");
        t1.setAge(25);
        Teacher t2=new Teacher();
        t2.setName("李四");
        t2.setAge(35);
        Teacher t3=new Teacher();
        t3.setName("老王");
        t3.setAge(19);
        Teacher t4=new Teacher();
        t4.setName("赵六");
        t4.setAge(29);

        List<Teacher> list=new ArrayList();
        list.add(t1);
        list.add(t2);
        list.add(t3);
        list.add(t4);

//        普通for 循环
        int sum=0;
        for(int i=0;i<list.size();i++){
            System.out.println("name为："+list.get(i).getName()+",年龄是："+list.get(i).getAge());
            sum+=list.get(i).getAge();
        }
        System.out.println("年龄的平均值为："+sum/list.size());


        System.out.println("--------------分割线---------------------");
//        增强for
        int all=0;
        for(Teacher tea:list){
            System.out.println("name是："+tea.getName()+",年龄是："+tea.getAge());
            all+=tea.getAge();
        }

        System.out.println("年龄的平均值为："+all/list.size());
    }


}

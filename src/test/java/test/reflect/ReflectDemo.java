package test.reflect;

import test.pojo.CaseInfo;

public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException {
//        1.通过类名获取
        Class clazz= CaseInfo.class;
//        2.有对象也是可以的（通过对象获取）
        CaseInfo caseInfo=new CaseInfo();
        Class clazz1 = caseInfo.getClass();
//        3.最常用，最灵活 -全类名的方式（1，2都需要知道类型）
        String className="test.pojo.CaseInfo";
        Class clazz3=Class.forName(className);

        System.out.println(clazz==clazz1);
        System.out.println(clazz1==clazz3);

    }
}

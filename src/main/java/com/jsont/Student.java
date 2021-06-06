package com.jsont;

public class Student {
    private String name;
    private int age;
    private int score;

    public Student(String 张三, int i, char 男) {
    }

    //必须包含无参构造
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getScore() {
        return score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setScore(int score) {
        this.score = score;
    }
}

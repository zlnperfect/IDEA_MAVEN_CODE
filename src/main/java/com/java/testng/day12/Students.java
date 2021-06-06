package com.java.testng.day12;

/**
 * 使用 @dataProvider 对 register(Student s)方法  进行3次测试 ,
 * Student 有 username、password、type、sex 4个私有属性。
 */
public class Students {
    private String username;
    private String password;
    private String type;
    private String sex;

    public Students(){}
    public Students(String username, String password, String type, String sex) {
        this.username = username;
        this.password = password;
        this.type = type;
        this.sex = sex;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getType() {
        return type;
    }

    public String getSex() {
        return sex;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Students{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", type='" + type + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}

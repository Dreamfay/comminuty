package com.woniuxy.community.Test611;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main1 {

    public static void main(String[] args) {

        User u1 = new User();
        u1.setAge(12);
        u1.setName("zs");
        User u2 = new User();
        u2.setAge(13);
        u2.setName("lisi");
        User u3 = new User();
        u3.setAge(14);
        u3.setName("wangw");
        User u4 = new User();
        u4.setAge(15);
        u4.setName("zhaoliu");
        User u5= new User();
        u5.setAge(16);
        u5.setName("zss");

        ArrayList<User> use = new ArrayList<>();
        Collections.addAll(use,u1, u2, u3, u4, u5);
        Collections.sort(use, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getAge()- o2.getAge();
            }
        });
        use.forEach(user -> System.out.println(user));
    }

}
class User{
    private String  name;
    private Integer age;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
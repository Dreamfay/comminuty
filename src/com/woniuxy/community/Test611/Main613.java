package com.woniuxy.community.Test611;

public class Main613 {

    public static void main(String[] args) {
        B  b =new B();
        A a = b;
        System.out.println(b.i);
        System.out.println(a.i);

    }
}
class A{
    public int i=10;
}
class B extends A{
    public int i =20;
}
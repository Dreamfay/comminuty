package com.woniuxy.community.study;

public class Main3 {
    public static void main(String[] args) {
//        Student stu = new Student("张三");
//
//        Thread t1 = new Thread(() -> {
//            System.out.println(Thread.currentThread().getName()+"开始打印");
//            stu.print();
//            System.out.println(Thread.currentThread().getName()+"结束打印");
//
//        }, "线程一");
//        Thread t2 = new
//                Thread(() -> {
//            System.out.println(Thread.currentThread().getName()+"开始打印");
//            stu.print();
//            System.out.println(Thread.currentThread().getName()+"结束打印");
//        }, "线程二");
//
//        Thread t3 = new Thread(() -> {
//            System.out.println(Thread.currentThread().getName()+"开始唤醒");
//            stu.notifyAlls();
//            System.out.println(Thread.currentThread().getName()+"结束唤醒");
//        }, "线程三");
//        t1.start();
//        t2.start();
//        t3.start();
            StringBuilder a = new StringBuilder();
            a.append("hello,world");
            a = a.reverse();
            System.out.println(a);
    }
}

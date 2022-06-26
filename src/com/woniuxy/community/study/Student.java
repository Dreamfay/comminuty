package com.woniuxy.community.study;

public class Student {
    private String name;

    public Student(String name){
        this.name = name;
    }

    /*线程同步*/

    public synchronized void print(){
        System.out.println(Thread.currentThread().getName()+
                "说："+ this.name);

        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void notifyOne(){
        notify();
    }


    public synchronized void notifyAlls(){
        notifyAll();
    }

}

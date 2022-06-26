package com.woniuxy.community.study;

public class Main69 {

    public static void main(String[] args) {
        Thread t1 = new Thread(new DeadLockTask(),"线程1");
        Thread t2 = new Thread(new DeadLockTask(),"线程2");
        //启动
        t1.start();
        t2.start();
    }
}


class DeadLockTask implements Runnable{
    private static Object a = new Object();
    private static Object b = new Object();

    @Override
    public void run() {

        synchronized (a){
            System.out.println(Thread.currentThread().getName()
                    +"说：锁住了a");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        synchronized (b){
                System.out.println(Thread.currentThread().getName()
                        +"说：锁住了b");
            }
        }
    }
}
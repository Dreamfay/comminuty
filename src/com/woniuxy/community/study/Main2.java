package com.woniuxy.community.study;

public class Main2 {

    public static void main(String[] args) {

        TickTask tickTask = new TickTask();
        Thread t1 = new Thread(tickTask,"窗口1");
        Thread t2 = new Thread(tickTask,"窗口2");
        Thread t3 = new Thread(tickTask,"窗口3");

        t1.start();
        t2.start();
        t3.start();

    }


}
class TickTask implements Runnable{
    private int ticket = 50;

    @Override
    public void run() {

    while (sell()){}
    }

    public synchronized boolean sell(){

            synchronized (this){
                if (ticket <= 0 ){
                    System.out.println(Thread.currentThread().getName()+"说：售票结束");
                    return false;
                }
                System.out.println(Thread.currentThread().getName()+"说：售票出第"+ticket+"张票");
                ticket --;
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return true;
            }
        }
}

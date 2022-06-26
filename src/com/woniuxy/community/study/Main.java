package com.woniuxy.community.study;

import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("主线程开启");

        MyThread my1 = new MyThread();
        my1.start();

        EmailTask em = new EmailTask();
        Thread emt = new Thread(em);
        emt.start();
        RedBagTask redBagTask = new RedBagTask();

        //线程池 5 个线程
        ExecutorService es = Executors.newFixedThreadPool(5);
        Future<Integer> res = es.submit(redBagTask);


        try {

            System.out.println(res.get());

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        System.out.println("主线程结束");

        es.shutdown();

        Thread thread1 = new Thread(()-> {
            for (int i = 0; i < 10; i++) {
                System.out.println("赵子龙 "+ DateFormat.getDateTimeInstance().format(new Date()));
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread1.start();
    }
}

class MyThread extends Thread{

    @Override
    public void run() {
        System.out.println("线程一 ");
    }

}

class EmailTask implements Runnable{

    @Override
    public void run() {
        System.out.println("线程二");
    }
}

class RedBagTask implements Callable<Integer>{

    @Override
    public Integer call() throws Exception {
        Random random = new Random();
        return random.nextInt(1000);
    }
}
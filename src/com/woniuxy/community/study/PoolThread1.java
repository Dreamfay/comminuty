package com.woniuxy.community.study;

import com.sun.corba.se.spi.orbutil.threadpool.ThreadPool;

import java.util.Date;
import java.util.Queue;
import java.util.concurrent.*;

public class PoolThread1 {
    public static void main(String[] args) {
/*
        ThreadPoolExecutor pools = new ThreadPoolExecutor(
                10,
                200,
                5,
                TimeUnit.MINUTES,
                new LinkedBlockingQueue<>(),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.DiscardOldestPolicy()
        );

        pools.execute(()-> System.out.println("给小丽发短信"));

        pools.execute(()-> System.out.println("给小丽发邮件"));
        pools.shutdown();
*/
     /*   Queue<String> queue = new LinkedBlockingQueue<>(200);
        //线程池
        ExecutorService es = Executors.newFixedThreadPool(5);
        //------------------------模拟3个生产者-----------------------
        es.execute(()->{
            queue.add("韩校长：欢迎大家来到深圳蜗牛！");
        });
        es.execute(()->{
            queue.add("陈校长：我来补充2句！");
        });
        es.execute(()->{
            queue.add("CEO：我在最后提1点！");
        });
        //------------------------模拟2个消费者-----------------------
        es.execute(()->{
            while(!queue.isEmpty()){
                System.out.println("消费者1：" + queue.poll());
            }
        });
        es.execute(()->{
            while(!queue.isEmpty()){
                System.out.println("消费者2：" + queue.poll());
            }
        });*/

        ScheduledThreadPoolExecutor pools = new ScheduledThreadPoolExecutor(10);
        pools.schedule(()-> System.out.println("5S过去了"),5,TimeUnit.SECONDS);

        pools.scheduleAtFixedRate(()->{
            System.out.println("起床了！！");
            System.out.println(new Date());
        },10,2,TimeUnit.SECONDS);


    }
}


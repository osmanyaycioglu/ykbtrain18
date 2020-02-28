package com.ykb.java.train.concurrent;

import java.util.concurrent.CountDownLatch;

public class ThreadRunner {
    public static void main(final String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(10);
        for (int i = 0; i < 2; i++) {
            MyThread myThread = new MyThread(countDownLatch);
            myThread.setName("MyThread-"
                             + i);
            myThread.start();
        }
        ReaderThread readerThread = new ReaderThread();
        readerThread.start();
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(10);
//        for (int i = 0; i < 100; i++) {
//            MyTask myTask = new MyTask();
//            newFixedThreadPool.execute(myTask);
//        }
        System.out.println("son : "
                           + MyThread.myCounter);
    }
}

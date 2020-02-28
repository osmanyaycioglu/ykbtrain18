package com.ykb.java.train.concurrent;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import com.ykb.java.train.singleton.LazySingleton;

public class MyThread extends Thread {

    private boolean shutdown;
    public static long myCounter = 0;
    public static long myCounter2 = 0;
    public static AtomicLong myAtomicCounter = new AtomicLong();
    public static ReentrantLock lock = new ReentrantLock(true);
    public static ReentrantReadWriteLock lock2 = new ReentrantReadWriteLock();
    private CountDownLatch countDownLatch;
    private static Semaphore semaphore = new Semaphore(5);
    private CyclicBarrier barrier = new CyclicBarrier(5);

    public MyThread(final CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    public static void increase() {
        synchronized (MyThread.class) {
            MyThread.myCounter++;
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 1_000_000_000; i++) {
            LazySingleton.getIntance()
                         .concurMethod();

            try {
                MyThread.semaphore.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                this.barrier.await();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            MyThread.increase();
//            MyThread.myAtomicCounter.incrementAndGet();
//            MyThread.lock.lock();
//            try {
//                boolean tryLock = MyThread.lock.tryLock(10,
//                                                        TimeUnit.SECONDS);
//
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            try {
//                MyThread.myCounter2++;
//            } finally {
//                MyThread.lock.unlock();
//            }
        }
        this.countDownLatch.countDown();
    }

    public boolean isShutdown() {
        return this.shutdown;
    }

    public void setShutdown(final boolean shutdown) {
        this.shutdown = shutdown;
    }

}

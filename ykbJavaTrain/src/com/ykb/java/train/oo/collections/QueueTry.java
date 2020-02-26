package com.ykb.java.train.oo.collections;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class QueueTry {
    public static void main(final String[] args) {
        BlockingQueue<String> stringQueue = new ArrayBlockingQueue<>(1000);
        stringQueue.add("1");
        String poll = stringQueue.poll();
        try {
            String take = stringQueue.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            String poll2 = stringQueue.poll(10,
                                            TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

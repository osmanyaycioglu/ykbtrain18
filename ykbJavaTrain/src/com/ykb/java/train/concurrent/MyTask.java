package com.ykb.java.train.concurrent;

public class MyTask implements Runnable {

    @Override
    public void run() {
        System.out.println("Task");
    }

}

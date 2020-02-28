package com.ykb.java.train.concurrent;

import com.ykb.java.train.singleton.LazySingleton;

public class ReaderThread extends Thread {
    @Override
    public void run() {
        LazySingleton.getIntance()
                     .concurReadMethod();
    }
}

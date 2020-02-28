package com.ykb.java.train.singleton;

public class EagerSingleton {
    private static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getIntance() {
        return EagerSingleton.instance;
    }

}

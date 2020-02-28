package com.ykb.java.train.singleton;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;

public class LazySingleton {
    private static volatile LazySingleton instance;

    private LazySingleton() {
    }

    public static LazySingleton getIntance() {
        if (LazySingleton.instance == null) {
            synchronized (LazySingleton.class) {
                if (LazySingleton.instance == null) {
                    LazySingleton.instance = new LazySingleton();
                    List<String> strArray = new ArrayList<>();
                    LazySingleton.instance.strs = Collections.synchronizedList(strArray);
                    LazySingleton.instance.strs = new CopyOnWriteArrayList<>();
                }
            }
        }
        return LazySingleton.instance;
    }

    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyy hh:mm");

    ThreadLocal<SimpleDateFormat> local = new ThreadLocal<SimpleDateFormat>() {
        @Override
        protected SimpleDateFormat initialValue() {
            return new SimpleDateFormat("dd/MM/yyy hh:mm");

        };
    };

    private List<String> strs = null;
    // private List<String> strs = new Vector<>();

    public void concurMethod() {

        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            this.strs.add("random"
                          + random.nextInt());
        }
        for (String string : this.strs) {
            System.out.println(string);
        }

    }

    public void concurReadMethod() {
        for (String string : this.strs) {
            System.out.println(string);
        }
    }

}

package com.ykb.java.train.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Example1 {
    public static void main(final String[] args) {
        Random random = new Random();
        List<Integer> listOfInt = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            listOfInt.add(random.nextInt(100));
        }

        List<Integer> resultList = new ArrayList<>();

        listOfInt.forEach(o -> {
            if (o > 50) {
                resultList.add(o);
            }
        });

        listOfInt.stream()
                 .filter(a -> a > 50)
                 .forEach(e -> resultList.add(e));

    }
}

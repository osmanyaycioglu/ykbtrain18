package com.ykb.java.train.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LambdaTry {
    public static void main(final String[] args) {
        List<String> asList = Arrays.asList("1",
                                            "2",
                                            "3");

        for (String string : asList) {
            System.out.println("item : "
                               + string);
        }

        asList.forEach(z -> System.out.println("item : "
                                               + z));
        Predicate<String> pred = d -> d.length() > 5;
        Predicate<String> or = pred.and(z -> z.length() < 20)
                                   .or(z -> z.contains("a"));
        System.out.println(or.test("sfs"));

    }
}

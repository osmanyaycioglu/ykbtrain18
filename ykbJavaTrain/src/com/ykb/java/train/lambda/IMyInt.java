package com.ykb.java.train.lambda;

@FunctionalInterface
public interface IMyInt {
    public static final int ABC = 1;

    String execute(String str);

    default String hello(final String str) {
        return "Hello "
               + this.execute(str);
    }

    default String hello2(final String str) {
        return "Hello2 "
               + this.execute(str);
    }

    static String helloStatic(final String str) {
        return "Hello "
               + str;
    }
}

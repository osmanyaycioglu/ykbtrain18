package com.ykb.java.train.exceptions;

public class MyTestClass {

    public void help(final String str) {
        if ("osman".equals(str)) {
            throw new IllegalStateException("osman giremezsin");
        }
        System.out.println("Sayın "
                           + str);
    }

    public void help2(final String str) throws MyUserException {
        if ("osman".equals(str)) {
            throw new MyUserException("osman giremezsin",
                                      100);
        }
        System.out.println("Sayın "
                           + str);
    }

}

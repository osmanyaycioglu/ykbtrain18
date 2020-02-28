package com.ykb.java.train.lambda;

public class MyIntImpl implements IMyInt {

    @Override
    public String execute(final String str) {

        return "Sayın "
               + str;
    }

}

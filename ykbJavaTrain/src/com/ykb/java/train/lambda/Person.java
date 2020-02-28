package com.ykb.java.train.lambda;

public class Person {
    private String a;
    private String b;
    private String c;

    public String getA() {
        return this.a;
    }

    public Person setA(final String a) {
        this.a = a;
        return this;
    }

    public String getB() {
        return this.b;
    }

    public Person setB(final String b) {
        this.b = b;
        return this;
    }

    public String getC() {
        return this.c;
    }

    public Person setC(final String c) {
        this.c = c;
        return this;
    }

    public static void main(final String[] args) {
        Person person = new Person().setA("")
                                    .setB("")
                                    .setC("");
    }
}

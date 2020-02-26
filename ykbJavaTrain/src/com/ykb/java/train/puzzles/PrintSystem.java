package com.ykb.java.train.puzzles;

public class PrintSystem {
    public void print(final Employee emp) {
        System.out.println(emp.getName()
                           + " "
                           + emp.getSurname()
                           + " "
                           + emp.getAge());
    }
}

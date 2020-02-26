package com.ykb.java.train.exceptions;

import java.util.Scanner;

public class ExpMain {
    public static void main(final String[] args) {
        MyTestClass myTestClass = new MyTestClass();
        try (Scanner scanner = new Scanner(System.in);) {
            myTestClass.help("osman1");
            System.out.println("help sonrası");
            return;
        } catch (IllegalStateException | NullPointerException e) {
            System.out.println("Illegal Exception");
        } catch (Exception e) {
            System.out.println("Exception");
        } finally {
            System.out.println("final");
        }
        try {
            myTestClass.help2("osman");
        } catch (MyUserException e) {
            e.printStackTrace();
        }
        System.out.println("son");
    }
}

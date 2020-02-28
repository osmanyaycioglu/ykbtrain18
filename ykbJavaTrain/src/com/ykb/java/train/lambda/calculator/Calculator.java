package com.ykb.java.train.lambda.calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(final String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("1-toplama");
            System.out.println("2-çıkarma");
            System.out.println("3-çarpma");
            System.out.println("4-bölme");
            int secim = scanner.nextInt();
            System.out.println("value1:");
            int value1 = scanner.nextInt();
            System.out.println("value2:");
            int value2 = scanner.nextInt();
            ICalculator cal = null;
            switch (secim) {
            case 1:
                cal = (a,
                       b) -> a
                             + b;
                break;
            case 2:
                cal = (a,
                       b) -> a
                             - b;
                break;
            case 3:
                cal = (a,
                       b) -> {
                    System.out.println("Çarpiyorum");
                    return a
                           * b;
                };
                break;
            case 4:
                cal = Calculator::bol;
                break;
            default:
                cal = (a,
                       b) -> a
                             + b;
                break;
            }
            System.out.println(cal.calculate(value1,
                                             value2));
        }
    }

    public static int bol(final int a,
                          final int b) {
        if (b == 0) {
            return 0;
        }
        return a
               / b;
    }
}

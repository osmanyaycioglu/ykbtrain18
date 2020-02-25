package com.ykb.java.train.basics;

import java.util.Random;
import java.util.Scanner;

public class IfElseTest {
	public static void main(String[] args) {
		Random r = new Random();
		int nextInt = r.nextInt(100);
		
		int a = 100;
		Scanner sc = new Scanner(System.in);
		System.out.println("sayı giriniz : ");
		int disDeger = sc.nextInt();
		if (disDeger > a) {
			System.out.println("büyük");
		} else if (disDeger == 0) {
		
		} else if (disDeger != 0) {
			
		} else if (disDeger <= 0) {
			
		} else {
			
		}
		if (disDeger == a || disDeger > a) {
			
		}
		if (disDeger == a && disDeger > a) {
			
		}
	}
}

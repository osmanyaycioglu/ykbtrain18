package com.ykb.java.train.basics;

public class Loops {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		loop1:while (true) {
			loop2:while (true) {
				System.out.println("hello");
				break loop1;
				// continue loop1;
			}
		}
		for(;;) {
			break;
		}
		
		do {
			
		} while (true);
	}
}

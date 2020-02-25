package com.ykb.java.train.oo.arrays;

import com.ykb.java.train.oo.Person;

public class ArrayWorkout {
	public static void main(final String[] args) {
		Integer[] ia = new Integer[10];
		for (int i = 0; i < ia.length; i++) {
			ia[i] = i;
		}
		if (ia[0] == 0) {
			System.out.println("Heyo");
		}
		System.out.println("9. eleman : " + ia[8]);

		Person[] personArray = new Person[10];
		for (int i = 0; i < personArray.length; i++) {
			personArray[i] = new Person("osman" + i, "yay" + i, 30 + i);
		}
		for (Person person : personArray) {
			System.out.println(person);
		}
	}
}

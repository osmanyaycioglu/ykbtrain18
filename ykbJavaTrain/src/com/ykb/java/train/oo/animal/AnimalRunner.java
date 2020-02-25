package com.ykb.java.train.oo.animal;

import java.util.Scanner;

public class AnimalRunner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int nextInt = scanner.nextInt();
		AnimalFactory animalFactory = new AnimalFactory();
		Animal animal = animalFactory.createAnimal(nextInt); 
		animal.eat();
		animal.sound();
		animal.move();
	}
}

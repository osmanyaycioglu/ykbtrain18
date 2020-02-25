package com.ykb.java.train.oo.animal;

public class AnimalFactory {
	public Animal createAnimal(int value) {
		Animal animal = null;
		switch (value) {
		case 1:
			animal = new Animal();
			break;
		case 2:
			animal = new Cat();
			break;
		case 3:
			animal = new Dog();
			break;
		case 4:
			animal = new Lion();
			break;
		default:
			animal = new Animal();
			break;
		}
		return animal;
	}
}

package com.ykb.java.train.oo.animal;

import com.ykb.java.train.oo.animal.model.Cat;
import com.ykb.java.train.oo.animal.model.Dog;
import com.ykb.java.train.oo.animal.model.Lion;

public class AnimalFactory {
	public static final int INDEX_ANIMAL = 1;
	public static final int INDEX_CAT = 2;
	public static final int INDEX_DOG = 3;
	public static final int INDEX_LION = 4;

	public Animal createAnimal(final int value) {
		Animal animal = null;
		switch (value) {
		case INDEX_ANIMAL:
			animal = new Animal();
			break;
		case INDEX_CAT:
			animal = new Cat();
			break;
		case INDEX_DOG:
			animal = new Dog();
			break;
		case INDEX_LION:
			animal = new Lion();
			break;
		default:
			animal = new Animal();
			break;
		}
		return animal;
	}
}

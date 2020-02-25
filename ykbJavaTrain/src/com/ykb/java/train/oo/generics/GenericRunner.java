package com.ykb.java.train.oo.generics;

import com.ykb.java.train.oo.Person;
import com.ykb.java.train.oo.animal.Animal;

public class GenericRunner {
	public static void main(final String[] args) {
		Holder<String> strHolder = new Holder<>();
		Holder<Person> personHolder = new Holder<>();
		Holder<Integer> integerHolder = new Holder<>();

		strHolder.setValue("ykb");
		personHolder.setValue(new Person("x", "y", 10));

		Holder holder = new Holder<>();

		Holder<?> holderx = new Holder<>();

		Holder<? extends Animal> holderAnimal = new Holder<>();
	}
}

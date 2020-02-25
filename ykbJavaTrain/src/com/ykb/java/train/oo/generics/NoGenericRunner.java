package com.ykb.java.train.oo.generics;

import com.ykb.java.train.oo.Person;

public class NoGenericRunner {
	public static void main(final String[] args) {
		ObjectHolder holder = new ObjectHolder();
		holder.setValue("osman");
		holder.setValue(new Person("osma", "yay", 20));

		Object value = holder.getValue();
		if (value instanceof String) {

		} else if (value instanceof Person) {

		}
	}
}

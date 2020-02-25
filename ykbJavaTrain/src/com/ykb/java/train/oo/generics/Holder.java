package com.ykb.java.train.oo.generics;

public class Holder<T> {
	private T value;

	public T getValue() {
		return this.value;
	}

	public void setValue(final T value) {
		this.value = value;
	}
}

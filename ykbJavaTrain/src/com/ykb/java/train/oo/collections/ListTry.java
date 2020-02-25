package com.ykb.java.train.oo.collections;

import java.util.ArrayList;
import java.util.List;

public class ListTry {
	public static void main(final String[] args) {
		List<String> strList = new ArrayList<>();
		long delta = System.currentTimeMillis();
		for (int i = 0; i < 2_000_000; i++) {
			strList.add("ykb" + i);
		}
		System.out.println("Add Delta : " + (System.currentTimeMillis() - delta));

		delta = System.currentTimeMillis();
		for (int i = 0; i < 2_000_000; i++) {
			String string = strList.get(i);
		}
		System.out.println("Get Delta : " + (System.currentTimeMillis() - delta));

		delta = System.currentTimeMillis();
		for (int i = 0; i < 2_000; i++) {
			strList.remove(900_000);
		}
		System.out.println("Remove Delta : " + (System.currentTimeMillis() - delta));
		// String[] stra = new String[10];
//
//		String[] strb = new String[20];
//		System.arraycopy(stra, 0, strb, 0, 10);
	}
}

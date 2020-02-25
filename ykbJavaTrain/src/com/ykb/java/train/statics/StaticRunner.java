package com.ykb.java.train.statics;

import java.util.Date;

import com.ykb.java.train.statics.test.MyClass;

public class StaticRunner {
	public static void main(final String[] args) {
		System.out.println("Başlangıç");
		boolean checkString = StringUtils.checkString("osman");
		String[] splitStr = StringUtils.splitStr("osman,mosman", ",");
		MyClass class1 = MyClass.createMyClassVersion1(100, new Date(), 10, 40, 60, new Date());
	}
}

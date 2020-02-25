package com.ykb.java.train.statics.test;

import java.util.Date;

public class MyClass {

	static {
		System.out.println("Çalıştım");
	}

	private int a1;
	private Date date1;
	private int a2;
	private int a3;
	private int a4;
	private int a5;
	private int a6;
	private Date date2;
	private int a7;
	private int a8;
	private int a9;
	private int str1;
	private int str2;
	private int str3;
	private int str4;
	private int str5;
	private int str6;
	private int str7;

	private MyClass() {
	}

	public static MyClass createMyClassVersion1(final int a1, final Date date1, final int a2, final int a5,
			final int a6, final Date date2) {
		MyClass m = new MyClass();
		m.a1 = a1;
		m.date1 = date1;
		m.a2 = a2;
		m.a5 = a5;
		return m;
	}

	public static MyClass createMyClassVersion2(final int a1, final Date date1, final int a2, final int a5,
			final int a6, final Date date2) {
		MyClass m = new MyClass();
		m.a1 = a1;
		m.date1 = date1;
		m.a2 = a2;
		m.a5 = a5;
		return m;
	}
//	public MyClass(final int a1, final Date date1, final int a2, final int a5, final int a6, final Date date2,
//			final int a7, final int str1, final int str2, final int str3, final int str4, final int str5,
//			final int str7) {
//		super();
//		this.a1 = a1;
//		this.date1 = date1;
//		this.a2 = a2;
//		this.a5 = a5;
//		this.a6 = a6;
//		this.date2 = date2;
//		this.a7 = a7;
//		this.str1 = str1;
//		this.str2 = str2;
//		this.str3 = str3;
//		this.str4 = str4;
//		this.str5 = str5;
//		this.str7 = str7;
//	}
//
//	public MyClass(final int a1, final Date date1, final int a2, final int a3, final int a4, final int a5, final int a6,
//			final Date date2, final int a7, final int a9, final int str1, final int str3, final int str4,
//			final int str6, final int str7) {
//		super();
//		this.a1 = a1;
//		this.date1 = date1;
//		this.a2 = a2;
//		this.a3 = a3;
//		this.a4 = a4;
//		this.a5 = a5;
//		this.a6 = a6;
//		this.date2 = date2;
//		this.a7 = a7;
//		this.a9 = a9;
//		this.str1 = str1;
//		this.str3 = str3;
//		this.str4 = str4;
//		this.str6 = str6;
//		this.str7 = str7;
//	}

	public int getA1() {
		return this.a1;
	}

	public void setA1(final int a1) {
		this.a1 = a1;
	}

	public Date getDate1() {
		return this.date1;
	}

	public void setDate1(final Date date1) {
		this.date1 = date1;
	}

	public int getA2() {
		return this.a2;
	}

	public void setA2(final int a2) {
		this.a2 = a2;
	}

	public int getA3() {
		return this.a3;
	}

	public void setA3(final int a3) {
		this.a3 = a3;
	}

	public int getA4() {
		return this.a4;
	}

	public void setA4(final int a4) {
		this.a4 = a4;
	}

	public int getA5() {
		return this.a5;
	}

	public void setA5(final int a5) {
		this.a5 = a5;
	}

	public int getA6() {
		return this.a6;
	}

	public void setA6(final int a6) {
		this.a6 = a6;
	}

	public Date getDate2() {
		return this.date2;
	}

	public void setDate2(final Date date2) {
		this.date2 = date2;
	}

	public int getA7() {
		return this.a7;
	}

	public void setA7(final int a7) {
		this.a7 = a7;
	}

	public int getA8() {
		return this.a8;
	}

	public void setA8(final int a8) {
		this.a8 = a8;
	}

	public int getA9() {
		return this.a9;
	}

	public void setA9(final int a9) {
		this.a9 = a9;
	}

	public int getStr1() {
		return this.str1;
	}

	public void setStr1(final int str1) {
		this.str1 = str1;
	}

	public int getStr2() {
		return this.str2;
	}

	public void setStr2(final int str2) {
		this.str2 = str2;
	}

	public int getStr3() {
		return this.str3;
	}

	public void setStr3(final int str3) {
		this.str3 = str3;
	}

	public int getStr4() {
		return this.str4;
	}

	public void setStr4(final int str4) {
		this.str4 = str4;
	}

	public int getStr5() {
		return this.str5;
	}

	public void setStr5(final int str5) {
		this.str5 = str5;
	}

	public int getStr6() {
		return this.str6;
	}

	public void setStr6(final int str6) {
		this.str6 = str6;
	}

	public int getStr7() {
		return this.str7;
	}

	public void setStr7(final int str7) {
		this.str7 = str7;
	}

}

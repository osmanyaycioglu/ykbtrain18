package com.ykb.java.train;

public class Calistir {
	public static void main(String[] args) {
		Araba ara = new Araba(100);
		int zaman = ara.ileriGit(1000);
		System.out.println("zaman : " + zaman);
		Araba aaa = ara; 
		
		Araba ara1 = new Araba(50);
		Araba ara2 = new Araba(60);
		Araba ara3 = new Araba(70);
	}
}

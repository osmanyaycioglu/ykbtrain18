package com.ykb.java.train;

public class Araba {
	public int kapiSayisi = 4;
	public int beygirGucu;
	private int ortalamaHiz;
	
	
	public Araba(int a) {
		ortalamaHiz = a;
	}

	public Araba(int a,int b) {
	}

	public int ileriGit(int km) {
		return km/ortalamaHiz;
	}
	
}

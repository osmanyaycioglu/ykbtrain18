package com.ykb.java.train.oo.project.navigation;

import java.util.ArrayList;
import java.util.List;

public class NaviyasyonCalistir {
	public static void main(final String[] args) {
		AracFabrikasi aracFabrikasi = new AracFabrikasi();
		Arac arac = aracFabrikasi.aracYarat(1);
		Navigasyon navigasyon = new Navigasyon();
		List<Yol> yollar = new ArrayList<>();
		yollar.add(new Yol(30, 60));
		yollar.add(new Yol(true));
		yollar.add(new Yol(80, 80));
		yollar.add(new Yol(true));
		yollar.add(new Yol(120, 10));
		double zamaniHesapla = navigasyon.zamaniHesapla(yollar, arac);
		System.out.println(zamaniHesapla);
	}
}

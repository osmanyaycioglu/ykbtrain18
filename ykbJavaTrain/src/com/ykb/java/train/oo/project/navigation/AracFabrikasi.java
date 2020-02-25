package com.ykb.java.train.oo.project.navigation;

public class AracFabrikasi {
	public Arac aracYarat(final int index) {
		switch (index) {
		case 1:
			return new Bisiklet();
		case 2:
			return new Araba();
		default:
			return new Araba();
		}
	}
}

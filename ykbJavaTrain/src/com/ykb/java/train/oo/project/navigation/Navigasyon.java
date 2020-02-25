package com.ykb.java.train.oo.project.navigation;

import java.util.List;

public class Navigasyon {
	public double zamaniHesapla(final Yol yol, final Arac arac) {
		if (yol.isDonus()) {
			return arac.getDonusZamani();
		} else {

			int ortalamaHiz = yol.getOrtalamaHiz();
			if (ortalamaHiz > arac.getOrtalamaHiz()) {
				ortalamaHiz = arac.getOrtalamaHiz();
			}
			double sure = (60 * (double) yol.getUzunluk()) / ortalamaHiz;
			return sure;
		}
	}

	public double zamaniHesapla(final List<Yol> yollar, final Arac arac) {
		double sonuc = 0;
		for (Yol yol : yollar) {
			sonuc += this.zamaniHesapla(yol, arac);
		}
		return sonuc;
	}
}

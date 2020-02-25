package com.ykb.java.train.oo.project.navigation;

public class Yol {
	private int ortalamaHiz;
	private int uzunluk;
	private boolean donus = false;

	public Yol(final int ortalamaHiz, final int uzunluk) {
		super();
		this.ortalamaHiz = ortalamaHiz;
		this.setUzunluk(uzunluk);
	}

	public Yol(final boolean donus) {
		super();
		this.setDonus(donus);
	}

	public int getOrtalamaHiz() {
		return this.ortalamaHiz;
	}

	public void setOrtalamaHiz(final int ortalamaHiz) {
		this.ortalamaHiz = ortalamaHiz;
	}

	public int getUzunluk() {
		return this.uzunluk;
	}

	public void setUzunluk(final int uzunluk) {
		this.uzunluk = uzunluk;
	}

	public boolean isDonus() {
		return donus;
	}

	public void setDonus(boolean donus) {
		this.donus = donus;
	}

}

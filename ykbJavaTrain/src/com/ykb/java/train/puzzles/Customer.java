package com.ykb.java.train.puzzles;

public class Customer {

    private String isim;
    private String soyisim;
    private int yas;

    public String getIsim() {
        return this.isim;
    }

    public Customer setIsim(final String isim) {
        this.isim = isim;
        return this;
    }

    public String getSoyisim() {
        return this.soyisim;
    }

    public Customer setSoyisim(final String soyisim) {
        this.soyisim = soyisim;
        return this;
    }

    public int getYas() {
        return this.yas;
    }

    public Customer setYas(final int yas) {
        this.yas = yas;
        return this;
    }

    @Override
    public String toString() {
        return "Customer [isim="
               + this.isim
               + ", soyisim="
               + this.soyisim
               + ", yas="
               + this.yas
               + "]";
    }

}

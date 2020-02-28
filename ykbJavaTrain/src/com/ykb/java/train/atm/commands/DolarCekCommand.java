package com.ykb.java.train.atm.commands;

import com.ykb.java.train.atm.EAccountType;

public class DolarCekCommand extends AbstractCekmeYatirmaCommand {

    public DolarCekCommand() {
        super("Dolar miktarını giriniz",
              EAccountType.DOLAR,
              "Dolar accountunuz yok.",
              true);
    }

    @Override
    public String getMenuStr() {
        return "Dolar Çek";
    }

}

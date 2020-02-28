package com.ykb.java.train.atm.commands;

import com.ykb.java.train.atm.EAccountType;

public class DolarYatirCommand extends AbstractCekmeYatirmaCommand {

    public DolarYatirCommand() {
        super("Yatıracağınız Dolar miktarını giriniz:",
              EAccountType.DOLAR,
              "Dolar accountunuz yok. Açtırın",
              false);
    }

    @Override
    public String getMenuStr() {
        return "Dolar Yatır";
    }

}

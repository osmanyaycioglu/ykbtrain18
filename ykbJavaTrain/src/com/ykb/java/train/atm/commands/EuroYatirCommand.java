package com.ykb.java.train.atm.commands;

import com.ykb.java.train.atm.EAccountType;

public class EuroYatirCommand extends AbstractCekmeYatirmaCommand {

    public EuroYatirCommand() {
        super("Yatıracağınız Euro miktarını giriniz:",
              EAccountType.EURO,
              "Euro accountunuz yok. Açtırın",
              false);
    }

    @Override
    public String getMenuStr() {
        return "Euro Yatır";
    }

}

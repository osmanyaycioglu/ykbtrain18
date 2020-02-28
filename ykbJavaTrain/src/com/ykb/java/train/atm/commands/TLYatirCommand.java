package com.ykb.java.train.atm.commands;

import com.ykb.java.train.atm.EAccountType;

public class TLYatirCommand extends AbstractCekmeYatirmaCommand {

    public TLYatirCommand() {
        super("Yatıracağınız parayı giriniz:",
              EAccountType.TL,
              "TL accountunuz yok. Açtırın",
              false);
    }

    @Override
    public String getMenuStr() {
        return "TL Yatır";
    }

}

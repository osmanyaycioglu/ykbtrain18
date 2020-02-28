package com.ykb.java.train.atm.commands;

import com.ykb.java.train.atm.EAccountType;

public class TLCekCommand extends AbstractCekmeYatirmaCommand {

    public TLCekCommand() {
        super("Çekeceğiniz TL miktarı : ",
              EAccountType.TL,
              "TL accountunuz yok.",
              true);
    }

    @Override
    public String getMenuStr() {
        return "TL Çek";
    }

}

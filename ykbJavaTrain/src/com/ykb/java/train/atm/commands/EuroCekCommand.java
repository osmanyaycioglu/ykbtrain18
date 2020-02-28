package com.ykb.java.train.atm.commands;

import com.ykb.java.train.atm.EAccountType;

public class EuroCekCommand extends AbstractCekmeYatirmaCommand {

    public EuroCekCommand() {
        super("Euro miktarını giriniz",
              EAccountType.EURO,
              "Euro accountunuz yok.",
              true);
    }

    @Override
    public String getMenuStr() {
        return "Euro Çek";
    }

}

package com.ykb.java.train.atm;

import java.util.ArrayList;
import java.util.List;

import com.ykb.java.train.atm.commands.DolarCekCommand;
import com.ykb.java.train.atm.commands.DolarYatirCommand;
import com.ykb.java.train.atm.commands.EuroCekCommand;
import com.ykb.java.train.atm.commands.EuroYatirCommand;
import com.ykb.java.train.atm.commands.TLCekCommand;
import com.ykb.java.train.atm.commands.TLYatirCommand;

public enum ECustomerType {
    GOLD {
        @Override
        public List<IATMCommand> getCommands() {
            List<IATMCommand> commands = ECustomerType.SILVER.getCommands();
            commands.add(new DolarYatirCommand());
            commands.add(new DolarCekCommand());
            return commands;
        }

    },
    PLATINUIM {
        @Override
        public List<IATMCommand> getCommands() {
            List<IATMCommand> commands = ECustomerType.GOLD.getCommands();
            commands.add(new EuroYatirCommand());
            commands.add(new EuroCekCommand());
            return commands;
        }

    },
    SILVER {
        @Override
        public List<IATMCommand> getCommands() {
            List<IATMCommand> menu = new ArrayList<>();
            menu.add(new TLYatirCommand());
            menu.add(new TLCekCommand());
            return menu;
        }

    };

    public List<IATMCommand> getCommands() {
        return null;
    }
}

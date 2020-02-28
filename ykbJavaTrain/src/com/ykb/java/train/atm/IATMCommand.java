package com.ykb.java.train.atm;

import java.util.Scanner;

public interface IATMCommand {
    void execute(Customer customer,
                 Scanner sc);

    String getMenuStr();
}

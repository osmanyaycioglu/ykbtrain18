package com.ykb.java.train.atm.commands;

import java.util.List;
import java.util.Scanner;

import com.ykb.java.train.atm.Account;
import com.ykb.java.train.atm.Customer;
import com.ykb.java.train.atm.EAccountType;
import com.ykb.java.train.atm.IATMCommand;

public abstract class AbstractCekmeYatirmaCommand implements IATMCommand {
    private String cekmeStr;
    private EAccountType accountType;
    private String errorStr;
    private boolean cekme;

    public AbstractCekmeYatirmaCommand(final String cekmeStr,
                                       final EAccountType accountType,
                                       final String errorStr,
                                       final boolean cekme) {
        super();
        this.cekmeStr = cekmeStr;
        this.accountType = accountType;
        this.errorStr = errorStr;
        this.cekme = cekme;
    }

    @Override
    public void execute(final Customer customer,
                        final Scanner sc) {
        System.out.println(this.cekmeStr);
        int paraMiktari = sc.nextInt();
        List<Account> accounts = customer.getAccounts();
        Account tlaccount = null;
        for (Account account : accounts) {
            if (account.getAccountType() == this.accountType) {
                tlaccount = account;
                break;
            }
        }
        if (tlaccount == null) {
            System.out.println(this.errorStr);
            return;
        }
        double balance = tlaccount.getBalance();
        if (this.cekme) {
            tlaccount.setBalance(balance
                                 - paraMiktari);
        } else {
            tlaccount.setBalance(balance
                                 + paraMiktari);

        }
        System.out.println(this.accountType
                           + " hesabınızda "
                           + tlaccount.getBalance());
    }

}

package com.ykb.java.train.atm;

public class Account {
    private double balance;
    private EAccountType accountType;

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(final double balance) {
        this.balance = balance;
    }

    public EAccountType getAccountType() {
        return this.accountType;
    }

    public void setAccountType(final EAccountType accountType) {
        this.accountType = accountType;
    }

    @Override
    public String toString() {
        return "Account [balance="
               + this.balance
               + ", accountType="
               + this.accountType
               + "]";
    }

}

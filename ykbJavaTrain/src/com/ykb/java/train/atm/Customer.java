package com.ykb.java.train.atm;

import java.util.List;

public class Customer {
    private String username;
    private String password;
    private String name;
    private String surname;
    private List<Account> accounts;
    private ECustomerType customerType;

    public String getUsername() {
        return this.username;
    }

    public void setUsername(final String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(final String surname) {
        this.surname = surname;
    }

    public List<Account> getAccounts() {
        return this.accounts;
    }

    public void setAccounts(final List<Account> accounts) {
        this.accounts = accounts;
    }

    public ECustomerType getCustomerType() {
        return this.customerType;
    }

    public void setCustomerType(final ECustomerType customerType) {
        this.customerType = customerType;
    }

    @Override
    public String toString() {
        return "Customer [username="
               + this.username
               + ", password="
               + this.password
               + ", name="
               + this.name
               + ", surname="
               + this.surname
               + ", accounts="
               + this.accounts
               + ", customerType="
               + this.customerType
               + "]";
    }

}

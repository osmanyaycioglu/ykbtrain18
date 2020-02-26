package com.ykb.java.train.atm;

public class ATM {
    public static void main(final String[] args) {
        CustomerManager customerManager = new CustomerManager(EReaderType.FILE);
        Customer cust = customerManager.getCustomer("osman");
        System.out.println(cust);
    }
}

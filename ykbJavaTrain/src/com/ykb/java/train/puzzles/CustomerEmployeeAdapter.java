package com.ykb.java.train.puzzles;

public class CustomerEmployeeAdapter extends Employee {

    public CustomerEmployeeAdapter(final Customer cust) {
        super(cust.getIsim(),
              cust.getSoyisim(),
              cust.getYas());
    }

}

package com.ykb.java.train.puzzles;

public class EmployeeConvertFactory {
    public static Employee convert(final Customer customer) {
        Employee employee = new Employee(customer.getIsim(),
                                         customer.getSoyisim(),
                                         customer.getYas());
        return employee;
    }
}

package com.ykb.java.train.puzzles;

public class PrintMain {
    public static void main(final String[] args) {
        Employee employee = new Employee("osman",
                                         "yay",
                                         50);
        PrintSystem printSystem = new PrintSystem();
        printSystem.print(employee);

        Customer customer = new Customer();
        customer.setIsim("mehmet");
        customer.setSoyisim("yay");
        customer.setYas(30);

        printSystem.print(EmployeeConvertFactory.convert(customer));
    }
}

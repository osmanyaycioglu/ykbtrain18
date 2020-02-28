package com.ykb.java.train.atm;

import java.util.List;
import java.util.Scanner;

public class ATM {
    public static void main(final String[] args) {
        CustomerManager customerManager = new CustomerManager(EReaderType.FILE);
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("username:");
            String username = scanner.next();
            System.out.println("password:");
            String password = scanner.next();

            Customer cust = customerManager.getCustomer(username);
            if (cust != null) {
                if (password.equals(cust.getPassword())) {
                    System.out.println("Successfully logged in");
                    System.out.println("Hello : "
                                       + cust.getName()
                                       + " "
                                       + cust.getUsername());
                    List<IATMCommand> commands = cust.getCustomerType()
                                                     .getCommands();
                    while (true) {
                        for (int i = 0; i < commands.size(); i++) {
                            System.out.println((i
                                                + 1)
                                               + "-"
                                               + commands.get(i)
                                                         .getMenuStr());

                        }

                        System.out.println("seçiminiz:");
                        int nextInt = scanner.nextInt();
                        if (commands.size() < nextInt) {
                            break;
                        }
                        IATMCommand iatmCommand = commands.get(nextInt
                                                               - 1);
                        iatmCommand.execute(cust,
                                            scanner);
                    }
                }
            } else {
                System.out.println("Login Failed");
            }
            System.out.println(cust);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

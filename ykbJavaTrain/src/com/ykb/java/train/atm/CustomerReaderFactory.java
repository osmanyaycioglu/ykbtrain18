package com.ykb.java.train.atm;

public class CustomerReaderFactory {
    public static ICustomerReader createCustomerReader(final EReaderType e) {
        switch (e) {
        case FILE:
            return new FileCustomerReader();

        default:
            return new FileCustomerReader();
        }
    }
}

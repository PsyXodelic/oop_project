package com.company;

import java.io.IOException;

/**
 * Created by op on 23.05.2016.
 */
public class UsaBank extends Bank {

    protected Accounts createAcc(String currency) throws IOException {
        if(currency.equals("USD")) {
            return new UsdAccounts();
        }else if (currency.equals("EUR")){
            return new EurAccounts();
        } else return null;
    }
}

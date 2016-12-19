package com.company;

import java.io.IOException;

public class RusBank extends Bank {

    protected Accounts createAcc(String currency) throws IOException {
        if(currency.equals("USD")) {
            return new UsdAccounts();
        }else if (currency.equals("EUR")){
            return new EurAccounts();
        }else if (currency.equals("RUB")){
            return new RubAccounts();
        }else if (currency.equals("BYR")){
            return new BlrAccounts();
        } else return null;
    }
}

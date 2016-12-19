package com.company;

import java.io.IOException;

public abstract class Bank {
    Accounts accs;

    public Accounts openAcc(String currency) throws IOException {
        accs = createAcc(currency);
        return accs;
    }
    protected abstract Accounts createAcc(String currency) throws IOException;

}

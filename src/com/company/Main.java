package com.company;

import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException {

        Bank BlrBank = new BlrBank();
        Bank UsaBank = new UsaBank();
        Accounts acc1 = BlrBank.openAcc("BYR");
        Accounts acc2 = UsaBank.openAcc("USD");
        acc1.showAcc();
        acc2.showAcc();
    }
}

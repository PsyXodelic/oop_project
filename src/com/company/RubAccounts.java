package com.company;

import java.io.*;


public class RubAccounts extends Accounts {
    public RubAccounts() throws IOException{
        BufferedReader stdin = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("Input name");
        name = stdin.readLine();
        System.out.println("Input ID");
        String i = stdin.readLine();
        id = Integer.parseInt(i);
        currency = "RUB";
        System.out.println("Input value");
        String v = stdin.readLine();
        value = Double.parseDouble(v);
    }
}

package com.company;

import java.io.*;

/**
 * Created by op on 24.05.2016.
 */
public class UsdAccounts extends Accounts {

    public UsdAccounts() throws IOException{
        BufferedReader stdin = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("Input name");
        name = stdin.readLine();
        System.out.println("Input ID");
        String i = stdin.readLine();
        id = Integer.parseInt(i);
        currency = "USD";
        System.out.println("Input value");
        String v = stdin.readLine();
        value = Double.parseDouble(v);
    }
}

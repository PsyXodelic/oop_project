package com.company;

import java.io.*;

public class BlrAccounts extends Accounts{


    public BlrAccounts() throws IOException {

        BufferedReader stdin = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("Input name");
        name = stdin.readLine();
        System.out.println("Input ID");
        String i = stdin.readLine();
        id = Integer.parseInt(i);
        currency = "BYR";
        System.out.println("Input value");
        String v = stdin.readLine();
        value = Double.parseDouble(v);
    }

    public void update(double value) {
        this.value = value;
        display();
    }

    public void display() {
        System.out.println("Current value = " + value);
    }
}

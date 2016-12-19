package com.company;

import java.io.*;
import java.util.ArrayList;


public abstract class Accounts{

    String name;
    int id;
    String currency;
    double value;

    /*Accounts(String name, int id, String currency, double value){
        this.name = name;
        this.id = id;
        this.currency = currency;
        this.value = value;
    }
    */

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }

    public String getCurrency() {
        return currency;
    }




    public void showAcc(){
        System.out.println(getId() + " " + getName()
                + " " + getCurrency() + " " + getValue());
    }
}

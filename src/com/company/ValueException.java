package com.company;


public class ValueException extends Exception {
    public ValueException(Throwable e){
        initCause(e);
    }
}

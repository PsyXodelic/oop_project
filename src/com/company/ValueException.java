package com.company;


/**
 * Created by op on 11.05.2016.
 */
public class ValueException extends Exception {
    public ValueException(Throwable e){
        initCause(e);
    }
}

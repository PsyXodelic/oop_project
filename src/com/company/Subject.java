package com.company;

/**
 * Created by op on 31.05.2016.
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();
}


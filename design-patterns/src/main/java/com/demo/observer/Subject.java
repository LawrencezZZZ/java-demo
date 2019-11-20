package com.demo.observer;

import java.util.ArrayList;

abstract class Subject {
    protected ArrayList<Observer> observers = new ArrayList();

    public void detach(Observer observer){
        observers.remove(observer);
    }

    public void tach(Observer observer){
        observers.add(observer);
    }

    public abstract void notify(Observer observer);



}

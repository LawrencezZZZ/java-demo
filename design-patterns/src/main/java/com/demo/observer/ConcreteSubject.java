package com.demo.observer;

public class ConcreteSubject extends Subject {
    @Override
    public void notify(Observer observer) {
        for(Observer o : observers){
            if(o != observer){
                o.update(observer.getName());
            }
        }
    }
}

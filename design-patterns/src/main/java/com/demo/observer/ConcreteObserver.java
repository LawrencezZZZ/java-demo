package com.demo.observer;

public class ConcreteObserver implements Observer {

    private String name;

    public ConcreteObserver(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void update(String name) {
        System.out.println(this.name + "收到" + "voice : your ally has been slained");
        System.out.println(this.name + "收到" + "text : 你的队友" + name +"被击杀");
    }

    @Override
    public void beAttacked(Subject subject) {
        subject.notify(this);
    }
}

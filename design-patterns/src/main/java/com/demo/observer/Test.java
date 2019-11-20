package com.demo.observer;

public class Test {
    public static void main(String[] args) {
        Observer o1 = new ConcreteObserver("小炮");
        Observer o2 = new ConcreteObserver("大嘴");
        Observer o3 = new ConcreteObserver("VN");
        Observer o4 = new ConcreteObserver("EZ");

        Subject subject = new ConcreteSubject();
        subject.tach(o1);
        subject.tach(o2);
        subject.tach(o3);
        subject.tach(o4);


        o1.beAttacked(subject);
    }
}

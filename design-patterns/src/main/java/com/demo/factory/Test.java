package com.demo.factory;

public class Test {
    public static void main(String[] args) {
        Factory factory = new CycleFactory();
        Product p  = factory.createProduct();
        p.display();
    }

}

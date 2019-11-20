package com.demo.factory;

public class CycleFactory extends Factory{

    public Product createProduct(){

        return new Cycle();
    }
}

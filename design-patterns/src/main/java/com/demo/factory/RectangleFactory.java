package com.demo.factory;

public class RectangleFactory extends Factory{

    public Product createProduct(){
       return new Rectangle();
    }
}

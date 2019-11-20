package com.demo.abstractFactory;

public class RedFactory extends Factory {

    @Override
    ProductCycle createProductCycle() {
        return new RedCycle();
    }

    @Override
    ProductRectangle createProductRectangle() {
        return new RedRectangle();
    }
}

package com.demo.abstractFactory;

public class BlackFactory extends Factory {

    @Override
    ProductCycle createProductCycle() {
        return new BlackCycle();
    }

    @Override
    ProductRectangle createProductRectangle() {
        return new BlackRectangle();
    }
}

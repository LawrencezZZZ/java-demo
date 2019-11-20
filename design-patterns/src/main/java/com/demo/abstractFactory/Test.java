package com.demo.abstractFactory;

public class Test {
    public static void main(String[] args) {
        // 需要什么界面风格配置就好。。。
//        Factory factory = new RedFactory();
        Factory factory = new BlackFactory();
        ProductRectangle p  = factory.createProductRectangle();

        ProductCycle c = factory.createProductCycle();
        p.display();
        c.display();


    }

}

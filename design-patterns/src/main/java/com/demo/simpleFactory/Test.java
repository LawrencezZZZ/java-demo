package com.demo.simpleFactory;

public class Test {
    public static void main(String[] args) {

        /**
         * 要生产什么，写到配置文件就好，不用改代码，符合开闭原则
         * 1、properties配置文件
         * 2、spring注入
         * 3、xml配置、解析
         */

        Product aa = Factory.createProduct("cycle");
        aa.display();
        Product bb = Factory.createProduct("rectangle");
        bb.display();
    }

}

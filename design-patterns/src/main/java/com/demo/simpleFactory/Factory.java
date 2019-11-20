package com.demo.simpleFactory;

public class Factory {
    /**
     * 如果要增加一个形状，就要改代码！！不符合开闭原则
     *
     * 可用反射方式实现不改代码
     * 进阶：利用注解实现不改代码
     * @param a
     * @return
     */
    public static Product createProduct(String a){
        Product product = null;
        if("cycle".equals(a)){
            product = new Cycle();
        }else if("rectangle".equals(a)){
           product = new Rectangle();
        }
        return product;
    }
}

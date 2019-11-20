package com.demo.singleton;

public class Demo {
    public static void main(String[] args) {
        new Demo();
    }

    static Demo d = new Demo();
    static {
        System.out.println("1");
    }
    {
        System.out.println("2");
    }

    Demo(){
        System.out.println("3");
        System.out.println("a="+a+",b="+b);
    }

    public static  void aa(){
        System.out.println("4");
    }

    int a = 9;
    int b = 99;
}

package com.demo.sync;

import org.openjdk.jol.info.ClassLayout;

public class Test {

    static A a = new A();

    /**
     * -XX:BiasedLockingStartupDelay=0
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        String[] s = new String[]{"ss"};
        System.out.println(ClassLayout.parseInstance(a).toPrintable());
        System.out.println("-----------------数组会多一个header：数组长度----------");
        System.out.println(ClassLayout.parseInstance(s).toPrintable());

        System.out.println(Integer.toHexString(a.hashCode()));
        System.out.println(ClassLayout.parseInstance(a).toPrintable());

        synchronized (a){
            System.out.println(ClassLayout.parseInstance(a).toPrintable());
        }
        new Thread(()->{
            System.out.println("thread1 running");
            test();
            System.out.println("thread1 end");
        }).start();

        new Thread(()->{
            System.out.println("thread2 running");
            test();
            System.out.println("thread2 end");
        }).start();

    }

    static void test(){
        System.out.println("--------------test method is running--------------");
        System.out.println("---------thread id: " + Thread.currentThread().getId());
        synchronized (a){
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println(ClassLayout.parseInstance(a).toPrintable());
        System.out.println("--------------test method end--------------");
    }
}

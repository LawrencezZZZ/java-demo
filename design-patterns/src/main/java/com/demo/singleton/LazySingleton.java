package com.demo.singleton;

public class LazySingleton {
    private LazySingleton(){

    }

    // 加上volatile关键字，保证可见性，即该属性会被及时更新到内存中，
    // 不经过cpu缓存等jvm的优化，因此效率会低
    private volatile static LazySingleton instance = null;

    public static LazySingleton getInstance() {
        if(instance == null){
            synchronized (LazySingleton.class){
                if(instance == null){
                    instance = new LazySingleton();
                }
            }

        }
        return instance;
    }
}

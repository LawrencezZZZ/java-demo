package com.demo.observer;

public interface Observer {
    void update(String name);

    void beAttacked(Subject subject);

    String getName();
}

package com.ab.observer;

//Observer
public abstract class Observer {
    protected Subject subject;

    abstract void update();
}

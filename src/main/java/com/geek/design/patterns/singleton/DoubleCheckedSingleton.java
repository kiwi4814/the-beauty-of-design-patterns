package com.geek.design.patterns.singleton;

public class DoubleCheckedSingleton {

    private static volatile DoubleCheckedSingleton instance;
    private static Object mutex = new Object();

    private DoubleCheckedSingleton() {
    }

    public static DoubleCheckedSingleton getInstance() {
        DoubleCheckedSingleton tempInstance = instance;
        if (null == tempInstance) {
            synchronized (mutex) {
                tempInstance = instance;
                if (null == tempInstance) {
                    instance = tempInstance = new DoubleCheckedSingleton();
                }
            }
        }
        return tempInstance;
    }

}
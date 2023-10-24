package com.daya.designpatterns.creational.singleton;

import java.io.Serializable;

public class SingletonDp implements Cloneable, Serializable {

    private static final long serialVersionUuid = 1;

    private static volatile SingletonDp singletonDp;

    private SingletonDp() {
        if (singletonDp != null) {
            throw new RuntimeException("Generics not allowed");
        }
    }

    @Override
    public SingletonDp clone() {
        throw new RuntimeException("Cloning not allowed");
    }


    public static SingletonDp getInstance() {

        if (singletonDp == null) {
            synchronized (SingletonDp.class) {
                if (singletonDp == null) {
                    singletonDp = new SingletonDp();
                }
            }
        }
        return singletonDp;
    }

}

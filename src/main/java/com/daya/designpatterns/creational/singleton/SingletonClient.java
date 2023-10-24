package com.daya.designpatterns.creational.singleton;


//Notes:
//1. Method can not have parameter. If it takes, it will become factory.
//2. Volatile ensure thread safe.
//3. Generics, Serialization and Clone need to be handled.

//drawbacks
//no interface, difficult to test, this is over-used

public class SingletonClient {
    public static void main(String[] args) {

        SingletonDp singletonDp = SingletonDp.getInstance();
        System.out.println(singletonDp);

        SingletonDp singletonDp1 = SingletonDp.getInstance();
        System.out.println(singletonDp1);
    }
}

package com.daya.designpatterns.creational.prototype;

public class PrototypeClient {

    public static void main(String[] args) {
        PrototypeDp prototypeDp = new PrototypeDp();

        Item aAa = prototypeDp.createItem("A Aa");
        System.out.println(aAa);

        Item mahabarath = prototypeDp.createItem("Mahabarath");
        System.out.println(mahabarath);
    }
}

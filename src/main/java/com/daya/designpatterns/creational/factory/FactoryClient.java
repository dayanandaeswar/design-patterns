package com.daya.designpatterns.creational.factory;

public class FactoryClient {

    public static void main(String[] args) {

        Website blobWebsite = FactoryDp.getWebsite(WebsiteType.BLOB);
        System.out.println(blobWebsite);
        Website shopWebsite = FactoryDp.getWebsite(WebsiteType.SHOP);
        System.out.println(shopWebsite);
    }
}

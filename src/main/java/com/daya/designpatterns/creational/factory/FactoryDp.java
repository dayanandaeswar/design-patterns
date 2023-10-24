package com.daya.designpatterns.creational.factory;

public class FactoryDp {

    public static Website getWebsite(WebsiteType websiteType) {

        return switch (websiteType) {
            case BLOB -> new Blog();
            case SHOP -> new Shop();
            default -> null;
        };
    }
}

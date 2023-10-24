package com.daya.designpatterns.creational.builder;


//pitfalls: typically immutable. will have static inner class, designed first approach, complex to develop
//contrast: prototype
//Builder, is to handle complex constructions.
//no interface required
//
public class BuilderClient {

    public static void main(String[] args) {

        BuilderDp vegBuilder = new BuilderDp.Builder()
                .meal("Veg Biriyani")
                .desert("Jamun")
                .drink("Pepsi")
                .additionalNote("Need extra masala").build();

        System.out.println(vegBuilder.getDrink());

        BuilderDp nonVegBuilder = new BuilderDp.Builder()
                .meal("Chicken Biriyani")
                .desert("Jamun")
                .additionalNote("Need extra masala").build();

        System.out.println(nonVegBuilder.getDrink());
    }
}

package com.daya.designpatterns.creational.abstractfactory;

public class AbstractFactoryClient {

    public static void main(String[] args) {

        CreditCardFactory creditCardFactory = CreditCardFactory.getCreditCard(700);
        CreditCard creditCard = creditCardFactory.getCreditCard(CardType.GOLD);
        CardValidator cardValidator = creditCardFactory.getCardValidator(CardType.GOLD);

        System.out.println(creditCardFactory.getClass());
        System.out.println(creditCardFactory.validate(creditCard, cardValidator));

        CreditCardFactory creditCardFactory1 = CreditCardFactory.getCreditCard(500);
        CreditCard creditCard1 = creditCardFactory1.getCreditCard(CardType.GOLD);
        CardValidator cardValidator1 = creditCardFactory1.getCardValidator(CardType.GOLD);

        System.out.println(creditCardFactory1.getClass());
        System.out.println(creditCardFactory1.validate(creditCard1, cardValidator1));
    }
}

package com.daya.designpatterns.creational.abstractfactory;

public class AmexPlatinumCreditCard extends CreditCard {

    public AmexPlatinumCreditCard() {
        super(CardIssuer.AMEX, CardType.PLATINUM);
    }
}

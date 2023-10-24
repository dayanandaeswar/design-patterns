package com.daya.designpatterns.creational.abstractfactory;

public class VisaPlatinumCreditCard extends CreditCard {

    public VisaPlatinumCreditCard() {
        super(CardIssuer.VISA, CardType.PLATINUM);
    }
}

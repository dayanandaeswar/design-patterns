package com.daya.designpatterns.creational.abstractfactory;

public class AmexGoldCreditCard extends CreditCard {

    public AmexGoldCreditCard() {
        super(CardIssuer.AMEX, CardType.GOLD);
    }
}

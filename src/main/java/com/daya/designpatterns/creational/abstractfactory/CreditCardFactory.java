package com.daya.designpatterns.creational.abstractfactory;

import javax.xml.validation.Validator;

public abstract class CreditCardFactory {

    public static CreditCardFactory getCreditCard(int creditScore) {

        if (creditScore > 650) {
            return new AmexFactory();
        } else {
            return new VisaFactory();
        }
    }

    public abstract CreditCard getCreditCard(CardType cardType);

    public abstract CardValidator getCardValidator(CardType cardType);

    public abstract boolean validate(CreditCard creditCard, CardValidator cardValidator);
}

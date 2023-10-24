package com.daya.designpatterns.creational.abstractfactory;

public class AmexPlatinumValidator implements CardValidator{

    @Override
    public boolean isValid(CreditCard creditCard) {
        return true;
    }
}

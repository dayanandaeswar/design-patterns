package com.daya.designpatterns.creational.abstractfactory;

public class AmexGoldValidator implements CardValidator{

    @Override
    public boolean isValid(CreditCard creditCard) {
        return true;
    }
}

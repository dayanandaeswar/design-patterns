package com.daya.designpatterns.creational.abstractfactory;

public class VisaPlatinumValidator implements CardValidator{

    @Override
    public boolean isValid(CreditCard creditCard) {
        return true;
    }
}

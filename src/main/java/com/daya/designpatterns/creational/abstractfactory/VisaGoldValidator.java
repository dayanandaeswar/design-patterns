package com.daya.designpatterns.creational.abstractfactory;

public class VisaGoldValidator implements CardValidator{

    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}

package com.daya.designpatterns.creational.abstractfactory;

public class VisaGoldCreditCard extends CreditCard{

      public VisaGoldCreditCard(){
          super(CardIssuer.VISA, CardType.GOLD);
      }
}

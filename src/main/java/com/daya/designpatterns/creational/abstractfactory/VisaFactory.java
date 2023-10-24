package com.daya.designpatterns.creational.abstractfactory;

public class VisaFactory extends CreditCardFactory {

    @Override
    public CreditCard getCreditCard(CardType cardType) {
        return switch (cardType) {
            case GOLD -> new VisaGoldCreditCard();
            case PLATINUM -> new VisaPlatinumCreditCard();
            default -> null;
        };
    }

    @Override
    public CardValidator getCardValidator(CardType cardType) {
        return switch (cardType) {
            case GOLD -> new VisaGoldValidator();
            case PLATINUM -> new VisaPlatinumValidator();
            default -> null;
        };
    }

    @Override
    public boolean validate(CreditCard creditCard, CardValidator cardValidator) {
        return cardValidator.isValid(creditCard);
    }
}

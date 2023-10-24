package com.daya.designpatterns.creational.abstractfactory;

public class AmexFactory extends CreditCardFactory {


    @Override
    public CreditCard getCreditCard(CardType cardType) {
        return switch (cardType) {
            case GOLD -> new AmexGoldCreditCard();
            case PLATINUM -> new AmexPlatinumCreditCard();
            default -> null;
        };
    }

    @Override
    public CardValidator getCardValidator(CardType cardType) {
        return switch (cardType) {
            case GOLD -> new AmexGoldValidator();
            case PLATINUM -> new AmexPlatinumValidator();
            default -> null;
        };
    }

    @Override
    public boolean validate(CreditCard creditCard, CardValidator cardValidator) {
        return cardValidator.isValid(creditCard);
    }
}

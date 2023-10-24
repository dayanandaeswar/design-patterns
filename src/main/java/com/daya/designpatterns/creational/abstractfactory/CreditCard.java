package com.daya.designpatterns.creational.abstractfactory;

public class CreditCard {

    private final CardIssuer cardIssuer;

    private final CardType cardType;
    protected int cardNumberLength;
    protected int cvv;

    public CreditCard(CardIssuer cardIssuer, CardType cardType) {
        this.cardIssuer = cardIssuer;
        this.cardType = cardType;
    }

    public CardIssuer getCardIssuer() {
        return cardIssuer;
    }

    public CardType getCardType() {
        return cardType;
    }

    public int getCardNumberLength() {
        return cardNumberLength;
    }

    public void setCardNumberLength(int cardNumberLength) {
        this.cardNumberLength = cardNumberLength;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }
}

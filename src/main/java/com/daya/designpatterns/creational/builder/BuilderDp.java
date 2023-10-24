package com.daya.designpatterns.creational.builder;

public class BuilderDp {

    private final String meal;
    private final String desert;
    private final String drink;
    private final String additionalNote;

    public BuilderDp(Builder builderDpBuilder){
        this.meal = builderDpBuilder.meal;
        this.desert = builderDpBuilder.desert;
        this.drink = builderDpBuilder.drink;
        this.additionalNote = builderDpBuilder.additionalNote;
    }

    public static class Builder {

        private String meal;
        private String desert;
        private String drink;
        private String additionalNote;

        public Builder desert(String desert){
            this.desert = desert;
            return this;
        }
        public Builder drink(String drink){
            this.drink = drink;
            return this;
        }
        public Builder additionalNote(String additionalNote){
            this.additionalNote = additionalNote;
            return this;
        }
        public Builder meal(String meal){
            this.meal = meal;
            return this;
        }

        public BuilderDp build(){
            return new BuilderDp(this);
        }
    }

    public String getMeal() {
        return meal;
    }

    public String getDesert() {
        return desert;
    }

    public String getDrink() {
        return drink;
    }

    public String getAdditionalNote() {
        return additionalNote;
    }
}


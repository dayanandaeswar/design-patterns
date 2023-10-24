package com.daya.designpatterns.creational.prototype;

public abstract class Item implements Cloneable{

    private float price;
    private String title;
    private String url;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Item{" +
                "price=" + price +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}

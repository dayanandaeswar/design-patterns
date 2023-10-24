package com.daya.designpatterns.creational.prototype;

public class Movie extends Item {

    private float runtime;

    public float getRuntime() {
        return runtime;
    }

    public void setRuntime(float runtime) {
        this.runtime = runtime;
    }


    @Override
    public String toString() {
        return "Movie{" +
                "runtime=" + runtime +
                ", price=" + getPrice() +
                ", title='" + getTitle() + '\'' +
                ", url='" + getUrl() + '\'' +
                '}';
    }
}

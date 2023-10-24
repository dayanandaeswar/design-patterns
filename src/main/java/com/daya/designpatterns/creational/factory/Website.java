package com.daya.designpatterns.creational.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {

    protected List<Page> pages = new ArrayList<>();

    public Website(){
        this.createWebsite();
    }

    abstract void createWebsite();

    public List<Page> getPages() {
        return pages;
    }

    public void setPages(List<Page> pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Website{" +
                "pages=" + pages +
                '}';
    }
}

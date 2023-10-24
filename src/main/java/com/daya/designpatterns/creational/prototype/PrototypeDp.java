package com.daya.designpatterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeDp {

    private Map<String, Item> items = new HashMap<>();

    public PrototypeDp(){
        loadItem();
    }

    private void loadItem() {

        Movie movie = new Movie();
        movie.setPrice(120);
        movie.setRuntime(2.50f);
        movie.setTitle("A Aa");
        movie.setUrl("amazon.in");

        Book book = new Book();
        book.setPrice(120);
        book.setNoOfPages(12);
        book.setTitle("Mahabarath");
        book.setUrl("flipkart.com");

        items.put(book.getTitle(), book);
        items.put(movie.getTitle(), movie);
    }

    public Item createItem(String title){

        Item item = null;
        try{
            item = (Item) (items.get(title)).clone();
        } catch (Exception e){
            e.printStackTrace();
        }
        return item;
    }
}

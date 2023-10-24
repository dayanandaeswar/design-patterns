package com.daya.designpatterns.creational.factory;

public class Blog extends Website{

    @Override
    void createWebsite() {
        pages.add(new PostPage());
        pages.add(new AboutPage());
        pages.add(new CommentPage());
        pages.add(new ContactPage());
    }
}

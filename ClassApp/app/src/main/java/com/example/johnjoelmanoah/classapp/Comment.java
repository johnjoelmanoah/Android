package com.example.johnjoelmanoah.classapp;

/**
 * Created by johnjoelmanoah on 2015-12-17.
 */

public class Comment {
    private String name;
    Comment(String names) {
        name = names;

    }
    public String gettitle()
    {

        return name;
    }
    public void settitle(String id)
    {

        this.name = name;
    }
    @Override
    public String toString() {
        return this.gettitle();
    }
}

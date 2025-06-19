package org.level1.exercise1.model;

public class Book {

    private final String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public String toString() {
        return "Título: " + this.title + ".\n";
    }

}
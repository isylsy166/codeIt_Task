package com.codeit.practice2.model;

public class Book {

    private String title;
    private String author;
    private String publisher;
    private int price;
    private double discountRate;

    public Book() {}

    public Book(String title, String publisher, String author) {
        this.title = title;
        this.publisher = publisher;
        this.author = author;
    }

    public Book(String title, String publisher, String author, int price, double discountRate) {
        this.title = title;
        this.publisher = publisher;
        this.author = author;
        this.price = price;
        this.discountRate = discountRate;
    }

    @Override
    public String toString() {
        return "Book {\n" +
                "  title         : '" + title + "'\n" +
                "  publisher     : '" + publisher + "'\n" +
                "  author        : '" + author + "'\n" +
                "  price         : " + price + "\n" +
                "  discountRate  : " + discountRate + "\n" +
                '}';
    }
}

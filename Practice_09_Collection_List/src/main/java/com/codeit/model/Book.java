package com.codeit.model;

import java.util.Objects;

public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private String category;
    private int price;

    public Book() {}

    public Book(String title, String author, String category, int price) {
        this.title = title;
        this.author = author;
        this.category = category;
        this.price = price;
    }

    // Getter & Setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // toString 오버라이딩
    @Override
    public String toString() {
        return title + "/" + author + "/" + category + "/" + price;
    }

    // equals & hashCode 오버라이딩
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return Objects.equals(title, book.title) &&
                Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }

    // compareTo: 제목 기준 정렬
    @Override
    public int compareTo(Book other) {
        return this.title.compareTo(other.title);
    }
}

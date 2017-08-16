package com.example.onetoone;

import javax.persistence.*;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;


    @OneToOne(cascade = CascadeType.ALL)
    private BookDetail bookDetail;


    public Book() {

    }

    public Book(String name, BookDetail bookDetail) {
        this.name = name;
        this.bookDetail = bookDetail;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BookDetail getBookDetaill() {
        return bookDetail;
    }

    public void setBookDetaill(BookDetail bookDetaill) {
        this.bookDetail = bookDetaill;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +bookDetail+
                '}';
    }
}

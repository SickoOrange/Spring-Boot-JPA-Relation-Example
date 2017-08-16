package com.example.onetoone;

import javax.persistence.*;


@Entity
public class BookDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private long numberOfPages;

    @OneToOne(mappedBy ="bookDetail")
    private Book book;

    public BookDetail(){}

    public BookDetail(long numberOfPages) {
        this.numberOfPages = numberOfPages;
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(long numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "BookDetail{" +
                "id=" + id +
                ", numberOfPages=" + numberOfPages +
                ", book=" + book +
                '}';
    }
}

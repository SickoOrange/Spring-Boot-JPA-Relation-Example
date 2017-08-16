package com.example.relationdemo;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class BookCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    @OneToMany(mappedBy = "bookCategory",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Set<Book> books;


    public BookCategory() {

    }

    public BookCategory(String name, List<Book> books) {
        this.name = name;

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

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "BookCategory{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", books=" + books +
                '}';
    }
}

package com.example.relationdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@SpringBootApplication
public class RelationdemoApplication implements CommandLineRunner {


    @Autowired
    private BookCategoryRepository bookCategoryRepository;

    public static void main(String[] args) {
        SpringApplication.run(RelationdemoApplication.class, args);
    }


    @Override
    @Transactional
    public void run(String... strings) throws Exception {
        System.out.println("run");

        BookCategory love = new BookCategory();
        HashSet<Book> books = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            Book book = new Book("love" + i, love);
            books.add(book);
        }
        love.setName("LOVE");
        love.setBooks(books);


        BookCategory sad = new BookCategory();
        HashSet<Book> sads = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            Book book = new Book("sad" + i, sad);
            sads.add(book);
        }
        sad.setName("SAD");
        sad.setBooks(sads);

        bookCategoryRepository.save(love);
        bookCategoryRepository.save(sad);


        for (BookCategory category : bookCategoryRepository.findAll()) {
            System.out.println(category.toString());
        }


    }

}

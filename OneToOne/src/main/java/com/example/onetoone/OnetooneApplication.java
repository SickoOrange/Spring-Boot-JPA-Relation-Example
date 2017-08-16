package com.example.onetoone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class OnetooneApplication implements CommandLineRunner {


    @Autowired
    BookRepository bookRepository;

    public static void main(String[] args) {
        SpringApplication.run(OnetooneApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {


        Book book1 = new Book("love", new BookDetail(50));
        Book book2 = new Book("sad", new BookDetail(200));
        bookRepository.save(book1);
        bookRepository.save(book2);

       // Book one = bookRepository.getOne((long) 1);
       // System.out.println(one);
        for (Book book : bookRepository.findAll()) {
            System.out.println(book.getBookDetaill().getId());
        }
    }
}

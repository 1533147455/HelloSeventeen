package com.studydemo.springbootv.repository;

import com.studydemo.springbootv.entity.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BookRepositoryTest {
    @Autowired
    private  BookRepository bookRepository;
    @Test
    void findAll() {
        List<Book> list = bookRepository.findAll();
        for(Book book:list){
            System.out.println(book);
        }

    }
}
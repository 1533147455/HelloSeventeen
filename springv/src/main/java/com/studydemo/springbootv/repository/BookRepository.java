package com.studydemo.springbootv.repository;

import com.studydemo.springbootv.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {
}

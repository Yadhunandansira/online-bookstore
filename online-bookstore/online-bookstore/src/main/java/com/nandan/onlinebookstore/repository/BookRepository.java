package com.nandan.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nandan.onlinebookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book,Long> {

}

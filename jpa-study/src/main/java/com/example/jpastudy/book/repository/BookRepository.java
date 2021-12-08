package com.example.jpastudy.book.repository;

import com.example.jpastudy.book.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface BookRepository extends JpaRepository<Book, Long> {

    @Modifying
    @Query(value = "update book set category=\"none\", nativeQuery = true")
    void update();
}

package com.example.jpastudy.book.repository;

import com.example.jpastudy.book.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;
import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {

//    @Modifying
//    @Query(value = "update book set category='none', nativeQuery = true")
//    void update();

    List<Book> findAllByDeletedFalse();

    List<Book> findByCategoryIsNullAndDeletedFalse();

    List<Book> findByCategoryIsNullAndNameEqualsAndCreatedAtGreaterThanEqualAndUpdatedAtGreaterThanEqual(String name, LocalDateTime createdAt, LocalDateTime updatedAt);

    @Query(value = "select b from Book b"
            + "where 'name' = ?1 and createAt >= ?2 and updateAt >= ?3 and category is null")
    List<Book> findByNameRecently(String name, LocalDateTime createdAt, LocalDateTime updateAt);
 }

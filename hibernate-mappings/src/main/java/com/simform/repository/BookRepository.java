package com.simform.repository;

import com.simform.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, String> {

    public Book findByBookId(Long bookId);

}
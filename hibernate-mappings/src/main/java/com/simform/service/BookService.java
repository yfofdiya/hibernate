package com.simform.service;

import com.simform.entity.Book;

public interface BookService {

    public Book saveBook(Book book);

    public Book findByBookId(Long bookId);
}
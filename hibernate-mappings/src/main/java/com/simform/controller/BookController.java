package com.simform.controller;

import com.simform.entity.Book;
import com.simform.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping
    public Book saveBook(@RequestBody Book book) {
        Book bookResponse = bookService.saveBook(book);
        return bookResponse;
    }

    @GetMapping("/{id}")
    public Book getBookDetails(@PathVariable("id") Long bookId) {
        Book bookResponse = bookService.findByBookId(bookId);
        return bookResponse;
    }

}
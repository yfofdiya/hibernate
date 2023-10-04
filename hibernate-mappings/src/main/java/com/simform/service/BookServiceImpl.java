package com.simform.service.impl;

import com.simform.entity.Book;
import com.simform.entity.Story;
import com.simform.exception.ResourceNotFoundException;
import com.simform.repository.BookRepository;
import com.simform.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    public Book saveBook(Book book) {
        List<Story> storyList = new ArrayList<>();

        Story story1 = new Story();
        story1.setStoryName("Arrays");

        Story story2 = new Story();
        story2.setStoryName("Pointers");

        Story story3 = new Story();
        story3.setStoryName("Loops");

        storyList.add(story1);
        storyList.add(story2);
        storyList.add(story3);

        story1.setBook(book);
        story2.setBook(book);
        story3.setBook(book);

        book.setStoryList(storyList);
        book = bookRepository.save(book);

        return book;
    }

    public Book findByBookId(Long bookId) {
        Book book = bookRepository.findByBookId(bookId);
        if (book == null) {
            throw new ResourceNotFoundException("Not Found");
        }
        return book;
    }
}
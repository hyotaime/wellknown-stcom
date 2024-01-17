package com.hirame59.wellknownstcom.service;

import com.hirame59.wellknownstcom.domain.Book;
import com.hirame59.wellknownstcom.repository.BookRepository;

import java.util.List;
import java.util.Optional;


public class BookService {
    private final BookRepository bookRepository;
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> findBooks() {
        return bookRepository.findAll();
    }

    public List<Book> findByName(String name) {
        return bookRepository.findByName(name);
    }

    public List<Book> findByCid(String cid) {
        return bookRepository.findByCid(cid);
    }
}

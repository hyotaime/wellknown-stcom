package com.hirame59.wellknownstcom.repository;

import com.hirame59.wellknownstcom.domain.Book;

import java.util.List;

public interface BookRepository {
    List<Book> findByName(String name);

    List<Book> findByCid(String cid);

    List<Book> findAll();

}

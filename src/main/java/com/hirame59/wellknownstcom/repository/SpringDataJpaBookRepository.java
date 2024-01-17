package com.hirame59.wellknownstcom.repository;

import com.hirame59.wellknownstcom.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SpringDataJpaBookRepository extends JpaRepository<Book, String>, BookRepository {
    @Override
    List<Book> findByName(String name);

    @Override
    List<Book> findByCid(String cid);

}

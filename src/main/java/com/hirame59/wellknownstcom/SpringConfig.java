package com.hirame59.wellknownstcom;

import com.hirame59.wellknownstcom.repository.InfoRepository;
import com.hirame59.wellknownstcom.repository.BookRepository;
import com.hirame59.wellknownstcom.service.BookService;
import com.hirame59.wellknownstcom.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    private final BookRepository bookRepository;
    private final InfoRepository infoRepository;


    @Autowired
    public SpringConfig(BookRepository bookRepository, InfoRepository infoRepository) {
        this.bookRepository = bookRepository;
        this.infoRepository = infoRepository;
    }

    @Bean
    public BookService bookService() {
        return new BookService(bookRepository);
    }

    @Bean
    public InfoService infoService() {
        return new InfoService(infoRepository);
    }
}
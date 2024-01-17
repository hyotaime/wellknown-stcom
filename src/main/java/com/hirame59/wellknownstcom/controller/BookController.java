package com.hirame59.wellknownstcom.controller;

import com.hirame59.wellknownstcom.domain.Book;
import com.hirame59.wellknownstcom.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @GetMapping("/findbook/name")
    public String createFormByName() {
        return "findBookByName.html";
    }
    @GetMapping("/findbook/cid")
    public String createFormByCid() {
        return "findBookByCid.html";
    }
    @GetMapping("/findbook/name/{name}")
    public ModelAndView findBookByName(@ModelAttribute("name") String name) {
        List<Book> book = bookService.findByName(name);
        ModelAndView mav = new ModelAndView();
        if (!book.isEmpty()) {
            mav.addObject("book", book);
            mav.setViewName("bookList");
        } else {
            mav.setViewName("class-not-found.html");
        }
        return mav;
    }
    @GetMapping("/findbook/cid/{cid}")
    public ModelAndView findBookByCid(@ModelAttribute("cid") String cid) {
        List<Book> book = bookService.findByCid(cid);
        ModelAndView mav = new ModelAndView();
        if (!book.isEmpty()) {
            mav.addObject("book", book);
            mav.setViewName("bookList");
        } else {
            mav.setViewName("class-not-found.html");
        }
        return mav;
    }

}

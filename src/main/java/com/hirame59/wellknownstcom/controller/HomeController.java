package com.hirame59.wellknownstcom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.hirame59.wellknownstcom.domain.Book;
import com.hirame59.wellknownstcom.domain.Info;
import com.hirame59.wellknownstcom.service.BookService;
import com.hirame59.wellknownstcom.service.InfoService;

import java.util.Comparator;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private BookService bookService;
    @Autowired
    private InfoService infoService;

    @GetMapping("/")
    public String home(Model model) {
        // 서비스 계층의 findMembers 메서드를 이용해 전체 랭킹 정보를 가져옴
        List<Book> book = bookService.findBooks();
        List<Info> info = infoService.findInfo();
        book.sort(Comparator.comparing(Book::getCid));
        info.sort(Comparator.comparing(Info::getId).reversed());
        model.addAttribute("book", book);
        model.addAttribute("info", info);
        return "home";
    }
}

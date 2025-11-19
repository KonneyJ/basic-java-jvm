package org.konneyj.controller;

import org.konneyj.model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @GetMapping("/book")
    public Book getBook() {
        return new Book("Вино из одуванчиков", "Рей Бредбери", 1957, 250);
    }
}

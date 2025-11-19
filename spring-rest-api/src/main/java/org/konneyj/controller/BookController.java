package org.konneyj.controller;

import org.konneyj.model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @GetMapping("/book")
    public Book getBook() {
        return new Book(1, "Вино из одуванчиков", "Рей Бредбери", 1957, 250);
    }

    @GetMapping("/books/{id}")
    public Book getBookById(@PathVariable int id) {
        return new Book(id, "BookName", "BookAuthor", 1900, 100);
    }
}

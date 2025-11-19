package org.konneyj.controller;

import lombok.extern.slf4j.Slf4j;
import org.konneyj.dto.CreateBookDto;
import org.konneyj.dto.UpdatedBookDto;
import org.konneyj.mapper.BookMapper;
import org.konneyj.model.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
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

    @GetMapping("/books/search")
    public Book searchBooks(@RequestParam(required = false) String title) {
        return new Book(1, title, "BookAuthor", 1800, 1000);
    }

    /*
    Первая версия реализации эндпоинта @PostMapping

    @PostMapping("/books")
    public Book createBook(@RequestBody Book newBook) {
        log.info("POST запрос на создание объекта {}", newBook);
        return new Book(newBook.getId(), newBook.getTitle(), newBook.getAuthor(), newBook.getPublishedYear(),
                newBook.getPages());
    }*/

    /*
    Вторая версия реализации эндпоинта @PostMapping

    @PostMapping("/books")
    public Book createBook(@RequestBody CreateBookDto newBook) {
        log.info("POST запрос на создание объекта {}", newBook);
        return BookMapper.toBook(newBook);
    }*/

    @PostMapping("/books")
    public ResponseEntity<Book> createBook(@RequestBody CreateBookDto newBook) {
        log.info("POST запрос на создание объекта {}", newBook);
        return ResponseEntity.status(HttpStatus.CREATED).body(BookMapper.toBook(newBook));
    }

    @PutMapping("/books/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable int id, @RequestBody UpdatedBookDto updatedBook) {
        log.info("PUT запрос на обновление объекта {}", updatedBook);
        return ResponseEntity.ok(BookMapper.toBook(updatedBook));
    }
}

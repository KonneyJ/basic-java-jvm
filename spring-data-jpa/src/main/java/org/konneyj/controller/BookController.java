package org.konneyj.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.konneyj.dto.book.BookDto;
import org.konneyj.dto.book.BookWithAuthorDto;
import org.konneyj.dto.book.NewBookDto;
import org.konneyj.dto.book.UpdateBookDto;
import org.konneyj.service.book.BookService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/books")
public class BookController {
    private final BookService bookService;

    @PostMapping
    public BookDto createBook(@RequestBody NewBookDto newBook) {
        log.info("POST запрос на создание объекта с newBookDto = {}", newBook);

        return bookService.saveBook(newBook);
    }

    @GetMapping("/{id}")
    public BookDto getBookById(@PathVariable Long id) {
        log.info("GET запрос на получение объекта с id = {}", id);

        return bookService.findBookById(id);
    }

    @GetMapping
    public Collection<BookDto> getAllBooks() {
        log.info("GET запрос на получение всех объектов");

        return bookService.getAllBooks();
    }

    @DeleteMapping("/{id}")
    public void deleteBookById(@PathVariable Long id) {
        log.info("DELETE запрос на удаление объекта с id = {}", id);

        bookService.deleteBookById(id);
    }

    @PutMapping("/{id}")
    public BookDto updateBook(@PathVariable Long id, @RequestBody UpdateBookDto updateBook) {
        log.info("PUT запрос на обновление объекта с id = {} объектом {}", id, updateBook);

        return bookService.updateBook(id, updateBook);
    }

    @GetMapping("/search-by-author")
    public Collection<BookDto> searchByAuthor(@RequestParam String author) {
        log.info("GET запрос на поиск книг по автору {}", author);

        return bookService.searchByAuthor(author);
    }

    @GetMapping("/search-by-title-author")
    public BookDto searchByTitleAndAuthor(@RequestParam String title, @RequestParam String author) {
        log.info("GET запрос на поиск книги по названию {} и автору {}", title, author);

        return bookService.searchByTitleAndAuthor(title, author);
    }

    @GetMapping("/search-by-part-title")
    public Collection<BookDto> searchByPartTitle(@RequestParam String searchText) {
        log.info("GET запрос на поиск книги по части названия {}", searchText);

        return bookService.searchByPartTitle(searchText);
    }

    @PostMapping("/with-author")
    public BookDto createBookWithAuthor(@RequestBody BookWithAuthorDto newBook) {
        log.info("POST запрос на создание объекта с BookWithAuthorDto = {}", newBook);

        return bookService.createBookWithAuthor(newBook);
    }
}

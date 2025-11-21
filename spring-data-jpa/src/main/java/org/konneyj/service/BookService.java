package org.konneyj.service;

import org.konneyj.model.Book;

import java.util.Collection;

public interface BookService {
    Book saveBook(Book book);

    Book findBookById(Long id);

    Collection<Book> getAllBooks();

    void deleteBookById(Long id);
}

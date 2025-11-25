package org.konneyj.service;

import org.konneyj.dto.BookDto;
import org.konneyj.dto.NewBookDto;
import org.konneyj.dto.UpdateBookDto;

import java.util.Collection;

public interface BookService {
    BookDto saveBook(NewBookDto newBook);

    BookDto findBookById(Long id);

    Collection<BookDto> getAllBooks();

    void deleteBookById(Long id);

    BookDto updateBook(Long id, UpdateBookDto updateBook);

    Collection<BookDto> searchByAuthor(String author);

    BookDto searchByTitleAndAuthor(String title, String author);
}

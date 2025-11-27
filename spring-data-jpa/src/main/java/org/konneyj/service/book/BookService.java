package org.konneyj.service.book;

import org.konneyj.dto.book.BookDto;
import org.konneyj.dto.book.CreateBookWithAuthorDto;
import org.konneyj.dto.book.NewBookDto;
import org.konneyj.dto.book.UpdateBookDto;

import java.util.Collection;

public interface BookService {
    BookDto saveBook(NewBookDto newBook);

    BookDto findBookById(Long id);

    Collection<BookDto> getAllBooks();

    void deleteBookById(Long id);

    BookDto updateBook(Long id, UpdateBookDto updateBook);

    Collection<BookDto> searchByAuthor(String author);

    BookDto searchByTitleAndAuthor(String title, String author);

    Collection<BookDto> searchByPartTitle(String searchText);

    BookDto createBookWithAuthor(CreateBookWithAuthorDto newBook);
}

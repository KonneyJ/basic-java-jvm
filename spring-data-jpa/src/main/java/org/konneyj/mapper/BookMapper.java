package org.konneyj.mapper;

import org.konneyj.dto.book.BookDto;
import org.konneyj.dto.book.BookWithAuthorDto;
import org.konneyj.dto.book.NewBookDto;
import org.konneyj.dto.book.UpdateBookDto;
import org.konneyj.model.Author;
import org.konneyj.model.Book;
import org.springframework.stereotype.Component;

@Component
public class BookMapper {
    public static Book toBook(NewBookDto newBook, Author author) {
        return new Book(null, newBook.getTitle(), author, newBook.getPublishedYear());
    }

    public static BookDto toBookDto(Book book) {
        return new BookDto((book.getId()), book.getTitle(), book.getAuthor().getName(), book.getPublishedYear());
    }

    public static Book toBook(UpdateBookDto updateBook, Author author) {
        return new Book(updateBook.getId(), updateBook.getTitle(), author, updateBook.getPublishedYear());
    }

    public static Book toBook(BookWithAuthorDto newBook, Author author) {
        return new Book(null, newBook.getTitle(), author, newBook.getPublishedYear());
    }
}

package org.konneyj.mapper;

import org.konneyj.dto.BookDto;
import org.konneyj.dto.NewBookDto;
import org.konneyj.dto.UpdateBookDto;
import org.konneyj.model.Book;
import org.springframework.stereotype.Component;

@Component
public class BookMapper {
    public static Book toBook(NewBookDto newBook) {
        return new Book(null, newBook.getTitle(), newBook.getAuthor(), newBook.getPublishedYear());
    }

    public static BookDto toBookDto(Book book) {
        return new BookDto((book.getId()), book.getTitle(), book.getAuthor(), book.getPublishedYear());
    }

    public static Book toBook(UpdateBookDto updateBook) {
        return new Book(updateBook.getId(), updateBook.getTitle(), updateBook.getAuthor(), updateBook.getPublishedYear());
    }
}

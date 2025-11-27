package org.konneyj.mapper;

import org.konneyj.dto.author.AuthorDto;
import org.konneyj.dto.author.NewAuthorDto;
import org.konneyj.model.Author;
import org.konneyj.model.Book;
import org.springframework.stereotype.Component;

@Component
public class AuthorMapper {
    public static AuthorDto toDto(Author author) {
        return new AuthorDto(author.getId(), author.getName(), author.getBooks().stream().map(Book::getTitle).toList());
    }

    public static Author toAuthor(NewAuthorDto author) {
        return new Author(null, author.getName());
    }
}

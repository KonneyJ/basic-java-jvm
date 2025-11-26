package org.konneyj.mapper;

import org.konneyj.dto.author.AuthorDto;
import org.konneyj.dto.author.NewAuthorDto;
import org.konneyj.model.Author;
import org.springframework.stereotype.Component;

@Component
public class AuthorMapper {
    public static AuthorDto toDto(Author author) {
        return new AuthorDto(author.getId(), author.getName(), author.getBooks());
    }

    public static Author toAuthor(NewAuthorDto author) {
        return new Author(null, author.getName());
    }
}

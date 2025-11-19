package org.konneyj.mapper;

import org.konneyj.dto.CreateBookDto;
import org.konneyj.dto.UpdatedBookDto;
import org.konneyj.model.Book;
import org.springframework.stereotype.Component;

@Component
public class BookMapper {
    public static Book toBook(CreateBookDto dto) {
        return new Book(1, dto.getTitle(), dto.getAuthor(), dto.getPublishedYear(), dto.getPages());
    }

    public static Book toBook(UpdatedBookDto dto) {
        return new Book(1, dto.getTitle(), dto.getAuthor(), dto.getPublishedYear(), dto.getPages());
    }
}

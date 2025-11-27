package org.konneyj.dto.author;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.konneyj.dto.book.BookDto;

import java.util.List;

@Getter
@ToString
@Setter
@AllArgsConstructor
public class AuthorDto {
    private Long id;
    private String name;
    private List<String> books;
}

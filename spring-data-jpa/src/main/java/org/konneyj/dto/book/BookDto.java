package org.konneyj.dto.book;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class BookDto {
    private Long id;
    private String title;
    private String author;
    private Integer publishedYear;
}

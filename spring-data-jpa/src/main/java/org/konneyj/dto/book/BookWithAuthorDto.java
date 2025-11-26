package org.konneyj.dto.book;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
@Setter
public class BookWithAuthorDto {
    private String title;
    private String authorName;
    private Integer publishedYear;
}

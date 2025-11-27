package org.konneyj.dto.book;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
@Setter
public class CreateBookWithAuthorDto {
    private String title;
    private String authorName;
    private Integer publishedYear;
}

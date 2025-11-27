package org.konneyj.dto.book;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
@Setter
public class NewBookDto {
    private String title;
    private Long authorId;
    private Integer publishedYear;
}

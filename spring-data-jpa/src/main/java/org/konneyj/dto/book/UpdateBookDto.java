package org.konneyj.dto.book;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UpdateBookDto {
    private Long id;
    private String title;
    private Long authorId;
    private Integer publishedYear;
}

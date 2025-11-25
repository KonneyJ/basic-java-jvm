package org.konneyj.dto;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class UpdateBookDto {
    private Long id;
    private String title;
    private String author;
    private Integer publishedYear;
}

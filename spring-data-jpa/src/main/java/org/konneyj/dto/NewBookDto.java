package org.konneyj.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
@Setter
public class NewBookDto {
    private String title;
    private String author;
    private Integer publishedYear;
}

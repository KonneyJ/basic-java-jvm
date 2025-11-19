package org.konneyj.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CreateBookDto {
    private String title;
    private String author;
    private int publishedYear;
    private int pages;
}

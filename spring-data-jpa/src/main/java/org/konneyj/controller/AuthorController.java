package org.konneyj.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.konneyj.dto.author.AuthorDto;
import org.konneyj.dto.author.NewAuthorDto;
import org.konneyj.service.author.AuthorService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/authors")
public class AuthorController {
    private final AuthorService authorService;

    @PostMapping
    public AuthorDto createBook(@RequestBody NewAuthorDto newAuthor) {
        log.info("POST запрос на создание объекта с newAuthorDto = {}", newAuthor);

        return authorService.createAuthor(newAuthor);
    }
}

package org.konneyj.service.author;

import org.konneyj.dto.author.AuthorDto;
import org.konneyj.dto.author.NewAuthorDto;

public interface AuthorService {
    AuthorDto createAuthor(NewAuthorDto newAuthor);
}

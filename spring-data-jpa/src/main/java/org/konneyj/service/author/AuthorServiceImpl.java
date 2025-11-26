package org.konneyj.service.author;

import lombok.RequiredArgsConstructor;
import org.konneyj.dto.author.AuthorDto;
import org.konneyj.dto.author.NewAuthorDto;
import org.konneyj.mapper.AuthorMapper;
import org.konneyj.repository.AuthorRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthorServiceImpl implements AuthorService {
    private final AuthorRepository authorRepository;

    @Override
    public AuthorDto createAuthor(NewAuthorDto newAuthor) {
        return AuthorMapper.toDto(authorRepository.save(AuthorMapper.toAuthor(newAuthor)));
    }
}

package org.konneyj.service;

import lombok.RequiredArgsConstructor;
import org.konneyj.dto.BookDto;
import org.konneyj.dto.NewBookDto;
import org.konneyj.dto.UpdateBookDto;
import org.konneyj.mapper.BookMapper;
import org.konneyj.model.Book;
import org.konneyj.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    @Override
    public BookDto saveBook(NewBookDto newBook) {
        Book savedBook = bookRepository.save(BookMapper.toBook(newBook));
        return BookMapper.toBookDto(savedBook);
    }

    @Override
    public BookDto findBookById(Long id) {
        Book findedBook = bookRepository.findById(id).orElseThrow(() -> new RuntimeException("Книга не найдена"));
        return BookMapper.toBookDto(findedBook);
    }

    @Override
    public Collection<BookDto> getAllBooks() {
        return bookRepository.findAll().stream()
                .map(BookMapper::toBookDto)
                .collect(Collectors.toList());
    }

    @Override
    public void deleteBookById(Long id) {
        bookRepository.deleteById(id);
    }

    @Override
    public BookDto updateBook(Long id, UpdateBookDto updateBook) {
        Book savedBook = bookRepository.save(BookMapper.toBook(updateBook));
        return BookMapper.toBookDto(savedBook);
    }
}

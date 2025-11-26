package org.konneyj.service.book;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.konneyj.dto.book.BookDto;
import org.konneyj.dto.book.BookWithAuthorDto;
import org.konneyj.dto.book.NewBookDto;
import org.konneyj.dto.book.UpdateBookDto;
import org.konneyj.mapper.BookMapper;
import org.konneyj.model.Author;
import org.konneyj.model.Book;
import org.konneyj.repository.AuthorRepository;
import org.konneyj.repository.BookRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;

    @Override
    public BookDto saveBook(NewBookDto newBook) {
        Author author = authorRepository.findById(newBook.getAuthorId())
                .orElseThrow(() -> new RuntimeException("Автор не найден"));
        Book savedBook = bookRepository.save(BookMapper.toBook(newBook, author));

        return BookMapper.toBookDto(savedBook);
    }

    @Override
    public BookDto findBookById(Long id) {
        Book findedBook = bookRepository.findById(id).orElseThrow(() -> new RuntimeException("Книга не найдена"));

        return BookMapper.toBookDto(findedBook);
    }

    @Override
    public Collection<BookDto> getAllBooks() {
        Collection<Book> books = bookRepository.findAll();
        books.forEach(book -> log.info("Имя автора книги {}", book.getAuthor().getName()));

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
        Author author = authorRepository.findById(updateBook.getAuthorId())
                .orElseThrow(() -> new RuntimeException("Автор не найден"));
        Book savedBook = bookRepository.save(BookMapper.toBook(updateBook, author));

        return BookMapper.toBookDto(savedBook);
    }

    @Override
    public Collection<BookDto> searchByAuthor(String author) {
        Collection<Book> books = bookRepository.findByAuthor_Name(author);

        return books.stream()
                .map(BookMapper::toBookDto)
                .collect(Collectors.toList());
    }

    @Override
    public BookDto searchByTitleAndAuthor(String title, String author) {
        Optional<Book> book = bookRepository.findByTitleAndAuthor_Name(title, author);
        return BookMapper.toBookDto(book.get());
    }

    @Override
    public Collection<BookDto> searchByPartTitle(String searchText) {
        Collection<Book> books = bookRepository.findByPartOfTitle(searchText);
        return books.stream()
                .map(BookMapper::toBookDto)
                .collect(Collectors.toList());
    }

    @Transactional
    @Override
    public BookDto createBookWithAuthor(BookWithAuthorDto newBook) {
        Author author = authorRepository.save(new Author(null, newBook.getAuthorName()));

        Random random = new Random();
        if (random.nextInt(2) % 2 == 0) {
            throw new RuntimeException("Книга не должна создаться в БД, также и автор не должен в ней сохраниться");
        }

        Book savedBook = bookRepository.save(BookMapper.toBook(newBook, author));

        return BookMapper.toBookDto(savedBook);
    }
}

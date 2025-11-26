package org.konneyj.repository;

import org.konneyj.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByAuthor_Name(String author);

    Optional<Book> findByTitleAndAuthor_Name(String title, String author);

    @Query("SELECT b FROM Book b JOIN FETCH b.author")
    List<Book> getAll();
}

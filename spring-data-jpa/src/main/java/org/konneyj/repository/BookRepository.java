package org.konneyj.repository;

import org.konneyj.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByAuthor_Name(String author);

    Optional<Book> findByTitleAndAuthor_Name(String title, String author);

    @Query("SELECT b FROM Book b JOIN FETCH b.author")
    List<Book> getAll();

    @Query("SELECT b FROM Book b WHERE lower(b.title) LIKE lower(concat('%', :searchText, '%')) ORDER BY b.publishedYear DESC")
    List<Book> findByPartOfTitle(@Param("searchText") String searchText);
}

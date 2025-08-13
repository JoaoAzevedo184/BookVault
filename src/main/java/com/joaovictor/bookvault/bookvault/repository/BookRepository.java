package com.joaovictor.bookvault.bookvault.repository;

import com.joaovictor.bookvault.bookvault.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByIdioma(String idioma);
    long countByIdioma(String idioma);
}

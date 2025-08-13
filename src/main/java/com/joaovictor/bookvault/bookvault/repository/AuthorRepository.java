package com.joaovictor.bookvault.bookvault.repository;

import com.joaovictor.bookvault.bookvault.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AuthorRepository extends JpaRepository<Author, Long> {
    Optional<Author> findByNome(String nome);
}

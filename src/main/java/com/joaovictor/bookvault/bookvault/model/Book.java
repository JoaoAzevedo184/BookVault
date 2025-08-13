package com.joaovictor.bookvault.bookvault.model;

import jakarta.persistence.*;

@Entity
@Table(name = "livros")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    @Enumerated(EnumType.STRING)
    private Language idioma;
    private int numeroDownloads;

    @ManyToOne(cascade = CascadeType.ALL)
    private Author author;

    public Book() {}

    public Book(String titulo, String idioma, int numeroDownloads, Author author) {
        this.titulo = titulo;
        this.idioma = Language.fromString();
        this.numeroDownloads = numeroDownloads;
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getIdioma() {
        return idioma;
    }

    public int getNumeroDownloads() {
        return numeroDownloads;
    }

    public Author getAuthor() {
        return author;
    }
}

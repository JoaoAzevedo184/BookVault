package com.joaovictor.bookvault.bookvault.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BookDTO {
    private int id;

    @JsonAlias("title")
    private String titulo;

    private List<AuthorDTO> authors;
    private List<String> languages;

    @JsonAlias("download_count")
    private int totalDownloads;

    public int getId() { return id; }
    public String getTitulo() { return titulo; }
    public List<AuthorDTO> getAuthors() { return authors; }
    public List<String> getLanguages() { return languages; }
    public int getTotalDownloads() { return totalDownloads; }
}

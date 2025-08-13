package com.joaovictor.bookvault.bookvault.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.joaovictor.bookvault.bookvault.api.ConsumptionAPI;
import com.joaovictor.bookvault.bookvault.repository.AuthorRepository;
import com.joaovictor.bookvault.bookvault.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    private final String ENDERECO = "https://gutendex.com/books/?search=";
    private final ConsumptionAPI consumptionAPI= new ConsumptionAPI();
    private final ObjectMapper mapper = new ObjectMapper();

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private AuthorRepository authorRepository;

    public void buscarLivroPorTitulo(String titulo) {
        String json = consumptionAPI.obterDados(ENDERECO + titulo.replace(" ", "+"));
        try {

        }
    }
}

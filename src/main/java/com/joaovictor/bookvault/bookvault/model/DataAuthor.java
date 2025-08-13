package com.joaovictor.bookvault.bookvault.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DataAuthor(
            @JsonAlias("name") String nome,
            @JsonAlias ("birth_year") Integer dataDeNascimento,
            @JsonAlias ("death_year") Integer dataDeFalecimento) {
}

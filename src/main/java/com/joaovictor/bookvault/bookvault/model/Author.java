package com.joaovictor.bookvault.bookvault.model;

import jakarta.persistence.*;

@Entity
@Table(name = "autores")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private int anoNascimento;
    private Integer anoFalecimento;
    private String status;

    public Author() {}

    public Author(String nome, int anoNascimento, Integer anoFalecimento) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.anoFalecimento = anoFalecimento;
        this.status = (anoFalecimento == null || anoFalecimento == 0) ? "Vivo": "Morreu em " + anoFalecimento;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public Integer getAnoFalecimento() {
        return anoFalecimento;
    }
}

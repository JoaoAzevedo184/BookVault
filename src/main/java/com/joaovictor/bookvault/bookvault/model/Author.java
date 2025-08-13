package com.joaovictor.bookvault.bookvault.model;

import jakarta.persistence.*;

import java.util.stream.Collectors;

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
        this.status = (anoFalecimento == null || anoFalecimento == 0) ? "Vivo": "Morreu";
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

    @Override
    public String toString() {
        String livrosFormatados = getBooks().isEmpty()
                ? "Nenhum livro registrado"
                : getLibros().stream()
                .map(livro -> "(" + livro.getTitulo() + ")")
                .collect(Collectors.joining(", "));
        if (status.equalsIgnoreCase("Vivo")){
            String mensagem = """
                ------------- AUTOR -------------
                    ▷ Nome: %s
                    ▷ Data de Nascimento: %d
                    ▷ Livros: %s
                ---------------------------------
                """.formatted(nome, anoNascimento, livrosFormatados);
        }
        String mensagem = """
                ------------- AUTOR -------------
                ▷ Nome : 
                ▷ Data de Nascimento :
                ▷ Livros : 
                ---------------------------------
                """.formatted(nome, fechaDeNacimiento, status, livrosFormatados);



        return "\n------------- AUTOR -------------" +
                "\nNome: " + nome +
                "\nAno de nascimento: " + fechaDeNacimiento +
                "\nAno de fallecimiento: " + fechaDeFallecimiento +
                "\nLibros: " + getLibros().stream().map(t -> "(" + t.getTitulo() + ")" ).collect(Collectors.toList()) +
                "\n----------------------------------";
    }
}

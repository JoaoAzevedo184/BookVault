package com.joaovictor.bookvault.bookvault.main;

import com.joaovictor.bookvault.bookvault.repository.AuthorRepository;
import com.joaovictor.bookvault.bookvault.repository.BookRepository;
import com.joaovictor.bookvault.bookvault.service.BookService;
import com.joaovictor.bookvault.bookvault.util.ConsoleView;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Scanner;

public class Main {

    private final Scanner scanner = new Scanner(System.in);

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;

    public Main(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    public void exibirMenu(){
        int opcao = -1;

        while (opcao != 0) {
            ConsoleView.mostrarMenu();

            try {
                opcao = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número.");
                continue;
            }

            switch (opcao) {
                case 1 -> {
                    System.out.print("Digite o título do livro: ");
                    String title = scanner.nextLine();
                    BookService.buscarLivroPorTitulo(title);
                }
                case 2 -> BookService.listarTodosOsLivros();
                case 3 -> {
                    System.out.print("Digite o idioma (ex: en ou pt): ");
                    String idioma = scanner.nextLine();
                    BookService.listarLivrosPorIdioma(idioma);
                }
                case 4 -> BookService.listarAutores();
                case 5 -> {
                    System.out.print("Digite o ano para consulta: ");
                    try {
                        int ano = Integer.parseInt(scanner.nextLine());
                        BookService.listarAutoresVivosEmAno(ano);
                    } catch (NumberFormatException e) {
                        System.out.println("Ano inválido.");
                    }
                }
                case 6 -> BookService.exibirEstatisticas();
                case 0 -> System.out.println("Saindo... Até mais!");
                default -> System.out.println("Opção inválida.");
            }
        }
    }
}

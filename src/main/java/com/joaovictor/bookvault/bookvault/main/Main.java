package com.joaovictor.bookvault.bookvault.main;

import com.joaovictor.bookvault.bookvault.util.ConsoleView;

import java.util.Scanner;

public class Main {

    private final Scanner scanner = new Scanner(System.in);

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
                    String titulo = scanner.nextLine();
                    livroService.buscarLivroPorTitulo(titulo);
                }
                case 2 -> livroService.listarTodosOsLivros();
                case 3 -> {
                    System.out.print("Digite o idioma (ex: en ou pt): ");
                    String idioma = scanner.nextLine();
                    livroService.listarLivrosPorIdioma(idioma);
                }
                case 4 -> livroService.listarAutores();
                case 5 -> {
                    System.out.print("Digite o ano para consulta: ");
                    try {
                        int ano = Integer.parseInt(scanner.nextLine());
                        livroService.listarAutoresVivosEmAno(ano);
                    } catch (NumberFormatException e) {
                        System.out.println("Ano inválido.");
                    }
                }
                case 6 -> livroService.exibirEstatisticas();
                case 0 -> System.out.println("Saindo... Até mais!");
                default -> System.out.println("Opção inválida.");
            }
        }
    }
}

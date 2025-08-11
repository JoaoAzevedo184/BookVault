package com.joaovictor.bookvault.bookvault.util;

public class ConsoleView {

    private static final String MENU = """
            
            [************************************************]
                                   MENU
            [************************************************]
            
            ▷  1. Buscar livro por título
            ▷  2. Listar todos os livros
            ▷  3. Listar livros por idioma
            ▷  4. Listar autores
            ▷  5. Listar autores vivos em determinado ano
            ▷  6. Exibir estatísticas por idioma
            
            ▷  0. Sair
            [************************************************]
            
            """;

    private static final String FIM = """
            
            [**********************************************]
                     👋 OBRIGADO POR TER USADO
            [**********************************************]
            
            """;

    public static void mostrarMenu() {
        System.out.print(MENU);
    }

    public static void fimPrograma() {
        System.out.print(FIM);
        System.exit(0);
    }
}

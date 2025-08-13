# Catálogo de Livros - Challenge ONE Back End

![Alura + Oracle](https://img.shields.io/badge/Alura%20%2B%20Oracle-Challenge%20Back%20End%20ONE-blue)
![Java](https://img.shields.io/badge/Java-21-orange)
![Status](https://img.shields.io/badge/Status-Concluído-success)

## 📋 Sobre o Projeto

Repositório do projeto LiterAlura, um catálogo de livros interativo via console, desenvolvido durante a jornada ONE (Oracle Next Education) da Alura.
Neste desafio, o programa consome dados da API Gutendex, manipula informações em JSON, armazena em banco de dados e permite ao usuário interagir com diversas opções, como listar livros, buscar por autor, idioma, entre outras funcionalidades.

## ✨ Funcionalidades

### Principais funcionalidades:

1. Listar livros disponíveis no catálogo
2. Buscar livros por autor
3. Filtrar livros por idioma
4. Visualizar detalhes de um livro
5. Adicionar livros favoritos
6. Histórico de buscas e leituras

## 🛠️ Tecnologias Utilizadas

<div align="center">

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![JSON](https://img.shields.io/badge/JSON-000000?style=for-the-badge&logo=json&logoColor=white)
![API REST](https://img.shields.io/badge/API%20REST-0078D4?style=for-the-badge&logo=microsoftedge&logoColor=white)

</div>

- **Java 21** - Linguagem de programação principal
- **API Gutendex** - Fonte dos dados dos livros
- **PostgreSQL 17** - Banco de dados relacional
- **SpringBoot 3** - Framework para aplicações Java 
- **HttpClient do Java** - Realização de requisições HTTP para API
- **Caracteres Unicode** - Criação de interfaces visuais com bordas e símbolos
- **Emojis Unicode** - Aprimoramento da experiência do usuário

## 📊 Exemplo de Uso

```bash
# Listar livros por autor
Digite o nome do autor: Machado de Assis

# Resultado
1. Dom Casmurro - Machado de Assis [Português]
2. Memórias Póstumas de Brás Cubas - Machado de Assis [Português]
...
```

## 🔄 API Gutendex

O projeto utiliza a API Gutendex para obter informações atualizadas sobre livros.

- **Documentação**: [https://gutendex.com/docs/](https://gutendex.com/docs/)
- **Endpoint utilizado**: `https://gutendex.com/books`
- **Funcionalidades utilizadas**: Listagem, busca e filtragem de livros

## 🚀 Como Executar

1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/bookvault.git
   cd bookvault
   ```

2. Compile o projeto (certifique-se de ter o JDK 21 instalado):
   ```bash
   javac -d out src/**/*.java
   ```

3. Execute a aplicação:
   ```bash
   java -cp out Main
   ```

4. Siga as instruções na interface do console para explorar o catálogo de livros.

> **Nota**: Para utilizar a API Gutendex, não é necessário chave de API.

## 📂 Estrutura do Projeto

```
src/
├── Main.java                           # Classe principal com o método main
├── api/
│   └── GutendexApiClient.java          # Cliente para comunicação com a API Gutendex
├── exception/
│   └── ApiException.java               # Classe de exceção personalizada para erros da API
├── model/
│   └── Book.java                       # Modelo de dados para armazenar informações dos livros
├── service/
│   └── BookService.java                # Serviço para manipulação e busca de livros
└── util/
    ├── ConsoleView.java                # Interface de usuário no console
    ├── BookHistory.java                # Gerenciamento do histórico de buscas/leitura
    └── FileGenerator.java              # Geração de arquivos para exportação do histórico
```

## 🙏 Agradecimentos

**Oracle e Alura** pelo programa ONE e pelo desafio proposto

## 👤 Autor
  
---  
Desenvolvido por João Azevedo. Para mais informações, entre em contato:
- **Gmail**: jonoffice37@gmail.com
- **Linkedin**: www.linkedin.com/in/joao-victor-azevedo-181-
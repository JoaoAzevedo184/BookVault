# Catálogo de Livros - Challenge ONE Back End

![Alura + Oracle](https://img.shields.io/badge/Alura%20%2B%20Oracle-Challenge%20Back%20End%20ONE-blue)
![Java](https://img.shields.io/badge/Java-21-orange)
![Status](https://img.shields.io/badge/Status-Concluído-success)

## 📋 Sobre o Projeto

Repositório do projeto LiterAlura, um catálogo de livros interativo via console, desenvolvido durante a jornada ONE (Oracle Next Education) da Alura.
Neste desafio, o programa consome dados de uma API de livros, manipula informações em JSON, armazena em banco de dados e permite ao usuário interagir com pelo menos 5 opções, como listar livros, buscar por autor, idioma, entre outras funcionalidades.



## ✨ Funcionalidades

### **Principais funcionalidades:**


5. **Taxas de câmbio atualizadas em tempo real**

## 🛠️ Tecnologias Utilizadas

<div align="center">

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![JSON](https://img.shields.io/badge/JSON-000000?style=for-the-badge&logo=json&logoColor=white)
![API REST](https://img.shields.io/badge/API%20REST-0078D4?style=for-the-badge&logo=microsoftedge&logoColor=white)

</div>

- **Java 21** - Linguagem de programação principal
- **API Gutendex** - Fornecimento de taxas de câmbio atualizadas
- **PostgreSQL 17**
- **SpringBoot 3**
- **Biblioteca Gson** - Manipulação de dados em formato JSON
- **HttpClient do Java** - Realização de requisições HTTP para API
- **Caracteres Unicode** - Criação de interfaces visuais com bordas e símbolos
- **Emojis Unicode** - Aprimoramento da experiência do usuário

## 📊 Exemplo de Uso

```

```

## 🔄 API Gutendex

O projeto utiliza a API Gutendex para obter taxas de câmbio atualizadas em tempo real.

- **Documentação**: [https://www.exchangerate-api.com/docs/pair-conversion-requests](https://www.exchangerate-api.com/docs/pair-conversion-requests)
- **Endpoint utilizado**: `https://v6.exchangerate-api.com/v6/API_KEY/pair/BASE/TARGET`
- **Funcionalidades utilizadas**: Conversão direta entre pares de moedas

## 🚀 Como Executar

1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/Currency-Converter.git
   cd Currency-Converter
   ```

2. Compile o projeto (certifique-se de ter o JDK 21 instalado):
   ```bash
   javac -d out src/**/*.java
   ```

3. Execute a aplicação:
   ```bash
   java -cp out Main
   ```

4. Siga as instruções na interface do console para realizar conversões de moedas.

> **Nota**: Para utilizar a API ExchangeRate, você precisará obter uma chave de API gratuita em [https://www.exchangerate-api.com/](https://www.exchangerate-api.com/) e configurá-la no código.

## 📂 Estrutura do Projeto

```
src/
├── Main.java                           # Classe principal com o método main
├── api/
│   └── ExchangeApiClient.java          # Cliente para comunicação com a API ExchangeRate
├── exception/
│   └── ApiException.java               # Classe de exceção personalizada para erros da API
├── model/
│   └── Currency.java                   # Modelo de dados para armazenar informações de moeda e taxas
├── service/
│   └── CurrencyService.java            # Serviço para realizar cálculos de conversão
└── util/
    ├── ConsoleView.java                # Interface de usuário no console
    ├── CurrencyConversionHistory.java  # Gerenciamento do histórico de conversões
    └── FileGenerater.java              # Geração de arquivos para exportação do histórico
```

## 🙏 Agradecimentos

**Oracle e Alura** pelo programa ONE e pelo desafio proposto

## 👤 Autor
  
---  
Desenvolvido por João Azevedo. Para mais informações, entre em contato:
- **Gmail**: jonoffice37@gmail.com
- **Linkedin**: www.linkedin.com/in/joao-victor-azevedo-181-sena
- **Github**: https://github.com/JoaoAzevedo184
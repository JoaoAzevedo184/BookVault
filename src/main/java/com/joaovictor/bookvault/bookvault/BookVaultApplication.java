package com.joaovictor.bookvault.bookvault;

import com.joaovictor.bookvault.bookvault.main.Main;
import com.joaovictor.bookvault.bookvault.repository.AuthorRepository;
import com.joaovictor.bookvault.bookvault.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookVaultApplication implements CommandLineRunner{

	@Autowired
	private AuthorRepository authorRepository;

	@Autowired
	private BookRepository bookRepository;

	public static void main(String[] args) {
		SpringApplication.run(BookVaultApplication.class, args);
	}

	@Override
	public void run(String... args){
		Main main = new Main(authorRepository,bookRepository);
		main.exibirMenu();
	}

}

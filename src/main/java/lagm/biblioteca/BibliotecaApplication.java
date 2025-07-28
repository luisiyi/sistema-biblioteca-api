package lagm.biblioteca;

import lagm.biblioteca.model.Book;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BibliotecaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BibliotecaApplication.class, args);
		Book book = new Book();
		book.setBookTitle("Piense y agase rico");
		System.out.println(book.toString());
	}

}

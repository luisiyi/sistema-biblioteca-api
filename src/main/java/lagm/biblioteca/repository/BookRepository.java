package lagm.biblioteca.repository;

import lagm.biblioteca.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}

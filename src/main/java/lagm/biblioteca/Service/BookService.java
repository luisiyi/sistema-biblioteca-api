package lagm.biblioteca.Service;

import lagm.biblioteca.model.Book;
import lagm.biblioteca.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService implements IBookService{

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> listBooks() {
        return this.bookRepository.findAll();
    }

    @Override
    public Book searchBookById(Integer idBook) {
        Book book = this.bookRepository.findById(idBook).orElse(null);
        return book;
    }

    @Override
    public Book saveBook(Book book) {
        return this.bookRepository.save(book);
    }

    @Override
    public void deleteBook(Integer idBook) {
        this.bookRepository.deleteById(idBook);
    }
}

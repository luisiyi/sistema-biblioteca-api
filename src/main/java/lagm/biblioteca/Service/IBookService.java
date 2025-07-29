package lagm.biblioteca.Service;

import lagm.biblioteca.model.Book;

import java.util.List;

public interface IBookService {
    List<Book> listBooks();

    Book searchBookById(Integer idBook);

    Book saveBook(Book book);

    void deleteBook(Integer idBook);

}

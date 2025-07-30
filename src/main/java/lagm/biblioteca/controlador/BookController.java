package lagm.biblioteca.controlador;

import lagm.biblioteca.Service.BookService;
import lagm.biblioteca.model.Book;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("bookstore-app")//http:localhost:8080/bookstore-app
@CrossOrigin(value = "http://localhost:4200")//puerto por default de angular
public class BookController {
    private static final Logger logger = LoggerFactory.getLogger(BookController.class);

    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public List<Book> listBooks(){
        List<Book> books = this.bookService.listBooks();
        logger.info("Books gotten");
        books.forEach(book -> logger.info(book.toString()));
        return books;
    }
}

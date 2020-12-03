package app.trsis.service;

import app.trsis.db.dao.BookRepository;
import app.trsis.db.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    public void create(Book book) {
        bookRepository.save(book);
    }

    public Iterable<Book> readAll() {
        return bookRepository.findAll();
    }

    public void delete(Integer id) {
        bookRepository.deleteById(id);
    }
}



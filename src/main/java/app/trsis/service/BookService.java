package app.trsis.service;

import app.trsis.db.model.Book;

public interface BookService {
    void create(Book book);

    void delete(Integer id);

    Iterable<Book> readAll();
}

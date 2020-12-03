package app.trsis.controller;

import app.trsis.db.model.Book;
import app.trsis.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping(value = "")
    public ResponseEntity<?> create(@RequestBody Book book) {
        bookService.create(book);
        return ResponseEntity.ok(book);
    }

    @GetMapping(value = "")
    public ResponseEntity<Object> read() {
        return ResponseEntity.ok(bookService.readAll());
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> delete(@PathVariable(name = "id") Integer id) {
        bookService.delete(id);

        return new ResponseEntity<>(HttpStatus.OK);
    }

}

package com.nandotech.bookapi.controller;

import com.nandotech.bookapi.dto.MessageResponseDTO;
import com.nandotech.bookapi.entity.Book;
import com.nandotech.bookapi.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/book")
public class BookController {

    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    // Annotation @RequestBody do the same as nodejs express req.body() to accept key-value paris
    @PostMapping // HTTP VERB POST
    @ResponseStatus(HttpStatus.CREATED) // exibe 201 ao invés de 200
    public MessageResponseDTO createBook(@RequestBody Book book) {
        return bookService.createBook(book);
    }
}

package com.nandotech.bookapi.service;

import com.nandotech.bookapi.dto.MessageResponseDTO;
import com.nandotech.bookapi.entity.Book;
import com.nandotech.bookapi.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

// Service is used to write the business logic in a different layer.
// To not mess with RestController
@Service
public class BookService {

    private BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public MessageResponseDTO createBook(Book book) {
        Book savedBook = bookRepository.save(book);
        return MessageResponseDTO
                .builder()
                .message("Book successfull created with ID: " + savedBook.getId() + " Data: " + savedBook)
                .build();
    }
}

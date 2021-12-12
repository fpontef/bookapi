package com.nandotech.bookapi.controller;

import com.nandotech.bookapi.dto.request.BookDTO;
import com.nandotech.bookapi.dto.response.MessageResponseDTO;
import com.nandotech.bookapi.service.BookService;
import com.nandotech.bookapi.service.exception.BookNotFoundException;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/book")
@NoArgsConstructor(onConstructor = @__(@Autowired))
public class BookController {

    private BookService bookService;

    // Annotation @RequestBody do the same as nodejs express req.body() to accept key-value paris
    @PostMapping // HTTP VERB POST
    @ResponseStatus(HttpStatus.CREATED) // exibe 201 ao invés de 200
    public MessageResponseDTO createBook(@RequestBody @Valid BookDTO bookDTO) {
        return bookService.createBook(bookDTO);
    }

    @GetMapping
    public List<BookDTO> listAll() {
        return bookService.listAll();
    }

    @GetMapping("/{id}")
    public BookDTO findById(@PathVariable Long id) throws BookNotFoundException {
        return bookService.findById(id);
    }

    @PutMapping("/{id}")
    public MessageResponseDTO updateById(@PathVariable Long id, @RequestBody BookDTO bookDTO) throws BookNotFoundException{
        return bookService.updateById(id, bookDTO);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Long id) throws BookNotFoundException {
        bookService.delete(id);
    }
}

package com.nandotech.bookapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/book")
public class BookController {

    @GetMapping // HTTP VERB GET
    public String getBook() {
        return "Teste de API!";
    }
}

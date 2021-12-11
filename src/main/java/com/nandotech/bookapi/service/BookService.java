package com.nandotech.bookapi.service;

import com.nandotech.bookapi.dto.request.BookDTO;
import com.nandotech.bookapi.dto.response.MessageResponseDTO;
import com.nandotech.bookapi.entity.Book;
import com.nandotech.bookapi.mapper.BookMapper;
import com.nandotech.bookapi.repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

// Service is used to write the business logic in a different layer.
// To not mess with RestController
@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class BookService {

    private BookRepository bookRepository;

    private final BookMapper bookMapper = BookMapper.INSTANCE;

//    @Autowired
//    public BookService(BookRepository bookRepository) {
//        this.bookRepository = bookRepository;
//    }

    public MessageResponseDTO createBook(BookDTO bookDTO) {
//        Book bookToSave = Book
//                .builder()
//                .title(bookDTO.getTitle())
//                .author(bookDTO.getAuthor())
//                .edition(bookDTO.getEdition())
//                .notes(bookDTO.getNotes())
//                .genre(bookDTO.getGenre())
//                .tags(bookDTO.getTags())
//                .build();

        // This will replace the bookToSave builder above
        Book bookToSave = bookMapper.toModel(bookDTO);

        Book savedBook = bookRepository.save(bookToSave);
        return MessageResponseDTO
                .builder()
                .message("Book successfull created with ID: " + savedBook.getId() + " Data: " + savedBook)
                .build();
    }

    public List<BookDTO> listAll() {
        List<Book> allBooks = bookRepository.findAll();

        System.out.println("ALLBOOKS >>>>>" + allBooks);
        return allBooks.stream()
                .map(bookMapper::toDTO)
                .collect(Collectors.toList());
    }
}

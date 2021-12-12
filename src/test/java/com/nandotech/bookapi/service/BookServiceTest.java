package com.nandotech.bookapi.service;

import com.nandotech.bookapi.dto.request.BookDTO;
import com.nandotech.bookapi.dto.response.MessageResponseDTO;
import com.nandotech.bookapi.entity.Book;
import com.nandotech.bookapi.repository.BookRepository;
import com.nandotech.bookapi.utils.BookUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class BookServiceTest {

    @Mock
    private BookRepository bookRepository;

    @InjectMocks
    private BookService bookService;

    @Test
    void testGivenBookDTOThenReturnSavedMessage() {
        BookDTO bookDTO = BookUtils.createFakeDTO();
        Book expectedSavedBook = BookUtils.createFakeEntity();

        Mockito.when(bookRepository.save(Mockito.any(Book.class))).thenReturn(expectedSavedBook);

        MessageResponseDTO expectedSuccessMessage = createExpectedMessageResponse(expectedSavedBook.getId());

        MessageResponseDTO successMessage = bookService.createBook(bookDTO);

        Assertions.assertEquals(expectedSuccessMessage, successMessage);

    }

    private MessageResponseDTO createExpectedMessageResponse(Long id) {
        return MessageResponseDTO
                .builder()
                .message("Created Book with id: " + id)
                .build();
    }
}

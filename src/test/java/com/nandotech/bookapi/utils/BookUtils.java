package com.nandotech.bookapi.utils;


import com.nandotech.bookapi.entity.Book;
import com.nandotech.bookapi.dto.request.BookDTO;
import com.nandotech.bookapi.enums.BookGenre;

import java.util.Collections;


public class BookUtils {

    private static final long BOOK_ID = 1L;
    private static final String TITLE = "Learn JS in 24 hours";
    private static final String AUTHOR = "João das Neves";
    private static final int EDITION = 1;
    private static final BookGenre GENRE = BookGenre.valueOf("TECH");

    public static BookDTO createFakeDTO() {
        return BookDTO.builder()
                .title(TITLE)
                .author(AUTHOR)
                .edition(EDITION)
                .genre(GENRE)
                .tags(Collections.singleton(TagUtils.createFakeDTO()))
                .build();
    }

    public static Book createFakeEntity() {
        return Book.builder()
                .id(BOOK_ID)
                .title(TITLE)
                .author(AUTHOR)
                .edition(EDITION)
                .genre(GENRE)
                .tags(Collections.singleton(TagUtils.createFakeEntity()))
                .build();
    }
}

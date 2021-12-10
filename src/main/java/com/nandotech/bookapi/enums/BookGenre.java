package com.nandotech.bookapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum BookGenre {
    TECH("Tech"),
    FANTASY("Fantasy"),
    ROMANCE("Romance"),
    THRILLER("Thriller");

    private final String description;
}

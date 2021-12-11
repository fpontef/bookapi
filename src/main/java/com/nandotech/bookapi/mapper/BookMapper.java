package com.nandotech.bookapi.mapper;

import com.nandotech.bookapi.dto.request.BookDTO;
import com.nandotech.bookapi.entity.Book;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

// The Mapper will convert from entity to DTO
@Mapper
public interface BookMapper {
    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

//    // Will convert the String on releaseDate to Date type
//    // I dont have this variable anymore, keep the Mapping for future reference
//    @Mapping(target = "releaseDate", source = "releaseDate", dateFormat = "dd-MM-yyyy")

    Book toModel(BookDTO bookDTO);

    BookDTO toDTO(Book book);
}

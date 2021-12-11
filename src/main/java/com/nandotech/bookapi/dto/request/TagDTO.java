package com.nandotech.bookapi.dto.request;

import com.nandotech.bookapi.entity.Book;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TagDTO {

    private Long id;

    @NotEmpty
    @Size(min = 2, max = 80)
    private String name;

    private Set<Book> books = new HashSet<>();
}

package com.nandotech.bookapi.dto.request;

import com.nandotech.bookapi.entity.Tag;
import com.nandotech.bookapi.enums.BookGenre;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

// DTO é o responsável por receber/validando todos os dados de entrada, sendo mapeado no DTO ao invés de Entidade,
// assumindo o papel do Entity no Controller
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BookDTO {
    private Long id;

    @NotEmpty
    @Size(min = 2, max = 100)
    private String title;

    @NotEmpty
    @Size(min = 2, max = 100)
    private String author;

    @NotEmpty
    @Size(min = 1, max = 3)
    private String edition;

    @Enumerated(EnumType.STRING)
    private BookGenre genre;

    @Size(max = 200)
    private String notes;

    @Valid
    @NotEmpty
    private Set<Tag> tags = new HashSet<>();

}

package com.nandotech.bookapi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Fetch;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
@Data // getter/setter by lombok
@Builder // construção de objetos
@AllArgsConstructor // construtor com todos os itens
@NoArgsConstructor // construtor sem itens
@Table(name = "tags")
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    // mappedBy will tell who "owns" the relationship
//    @ManyToMany( mappedBy = "books", cascade = CascadeType.PERSIST)
//    private Set<Book> books = new HashSet<>();
}

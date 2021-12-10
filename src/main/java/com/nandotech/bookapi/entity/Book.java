package com.nandotech.bookapi.entity;

import com.nandotech.bookapi.enums.BookGenre;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String author;

    @Column(nullable = false)
    private String edition;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private BookGenre genre;

    private String notes;

    // Set to avoid repeat
//    @OneToMany( fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE})
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    @JoinTable( name = "book_tag",
//            joinColumns = { @JoinColumn (name = "book_id" )},
//            inverseJoinColumns= { @JoinColumn (name = "tag_id" )}
//    )
    private Set<Tag> tags = new HashSet<>();
}

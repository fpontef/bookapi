package com.nandotech.bookapi.repository;

import com.nandotech.bookapi.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// JpaRepositry Inteface, will avoid CRUD basis by hand
@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}

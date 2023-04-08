package com.xfactor.openlibrary.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xfactor.openlibrary.domain.Book;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long>  {

    List<Book> findByIsbn(String isbn);

    List<Book> findByTitleAndIsbn(String title, String isbn);

}
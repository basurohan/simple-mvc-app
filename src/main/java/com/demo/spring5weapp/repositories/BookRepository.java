package com.demo.spring5weapp.repositories;

import com.demo.spring5weapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}

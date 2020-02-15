package com.demo.spring5weapp.repositories;

import com.demo.spring5weapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}

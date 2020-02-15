package com.demo.spring5weapp.repositories;

import com.demo.spring5weapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}

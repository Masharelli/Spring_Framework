package com.example.SpringProject.Repositories;

import com.example.SpringProject.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {

}

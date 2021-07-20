package com.example.SpringProject.Repositories;

import com.example.SpringProject.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}

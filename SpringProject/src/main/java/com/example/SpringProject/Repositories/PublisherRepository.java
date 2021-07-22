package com.example.SpringProject.Repositories;

import com.example.SpringProject.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}

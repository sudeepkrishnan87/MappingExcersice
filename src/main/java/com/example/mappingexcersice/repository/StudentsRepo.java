package com.example.mappingexcersice.repository;

import com.example.mappingexcersice.manytomany.Students;
import org.springframework.data.repository.CrudRepository;

public interface StudentsRepo extends CrudRepository<Students,Long> {
}

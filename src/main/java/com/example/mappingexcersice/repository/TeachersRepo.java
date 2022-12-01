package com.example.mappingexcersice.repository;

import com.example.mappingexcersice.manytomany.Teachers;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeachersRepo extends CrudRepository<Teachers,Long> {
}

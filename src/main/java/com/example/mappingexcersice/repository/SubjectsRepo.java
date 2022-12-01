package com.example.mappingexcersice.repository;

import com.example.mappingexcersice.onetomany.Subjects;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectsRepo extends CrudRepository<Subjects,Long> {
}

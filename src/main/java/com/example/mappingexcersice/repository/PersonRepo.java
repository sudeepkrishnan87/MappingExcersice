package com.example.mappingexcersice.repository;

import com.example.mappingexcersice.onetoone.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepo extends CrudRepository<Person,Long> {
}

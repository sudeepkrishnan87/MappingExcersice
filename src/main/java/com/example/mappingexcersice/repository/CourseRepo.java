package com.example.mappingexcersice.repository;

import com.example.mappingexcersice.onetomany.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepo extends CrudRepository<Course,Long> {
}

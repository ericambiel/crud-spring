package com.ericambiel.crudspring.repository;

import com.ericambiel.crudspring.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> { // <class to represent repository, type of primary ID>

}

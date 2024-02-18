package com.microservice.course.microservicecourse.repositories;

import com.microservice.course.microservicecourse.entities.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends CrudRepository<Course,Long> {
}

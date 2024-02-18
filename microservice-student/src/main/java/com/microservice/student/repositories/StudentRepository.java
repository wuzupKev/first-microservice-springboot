package com.microservice.student.repositories;

import com.microservice.student.entities.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository  extends CrudRepository<Student,Long> {
    List<Student> findAllByCourseId(long id);
}

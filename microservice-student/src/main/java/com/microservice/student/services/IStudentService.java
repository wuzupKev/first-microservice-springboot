package com.microservice.student.services;

import com.microservice.student.entities.Student;

import java.util.List;
import java.util.Optional;

public interface IStudentService {
    List<Student> findAll();
    Optional<Student> findById(long id);
    void save (Student student);
    List<Student> findByIdCourse(long id);
}

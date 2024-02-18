package com.microservice.course.microservicecourse.services;

import com.microservice.course.microservicecourse.entities.Course;
import com.microservice.course.microservicecourse.http.response.StudentByCourseResponse;

import java.util.List;
import java.util.Optional;

public interface ICourseService {
    List<Course> findAll();

    Optional<Course> findById(long id);

    void save(Course course);

    StudentByCourseResponse findStudentByIdCourse(Long idCourse);
}
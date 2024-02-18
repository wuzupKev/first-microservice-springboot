package com.microservice.course.microservicecourse.services;

import com.microservice.course.microservicecourse.client.StudentClient;
import com.microservice.course.microservicecourse.dto.StudentDto;
import com.microservice.course.microservicecourse.entities.Course;
import com.microservice.course.microservicecourse.http.response.StudentByCourseResponse;
import com.microservice.course.microservicecourse.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CourseService implements  ICourseService{
    @Autowired
    private CourseRepository courseRepository;
    @Autowired
    private StudentClient studentClient;
    @Override
    public List<Course> findAll() {
        return (List<Course>) courseRepository.findAll();
    }

    @Override
    public Optional<Course> findById(long id) {
        return courseRepository.findById(id);
    }

    @Override
    public void save(Course course) {
        courseRepository.save(course);
    }

    @Override
    public StudentByCourseResponse findStudentByIdCourse(Long idCourse) {
        //consultar curso
        Course course= courseRepository.findById(idCourse).orElse(new Course());
        //obtener estudiantes
        List<StudentDto> studentDtoList = (List<StudentDto>) studentClient.findAllStudentsByCourse(idCourse);


        return StudentByCourseResponse.builder()
                .courseName(course.getName())
                .teacher(course.getTeacher())
                .studentDtos(studentDtoList)
                .build();
    }
}

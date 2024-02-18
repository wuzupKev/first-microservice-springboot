package com.microservice.course.microservicecourse.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "mscv-student" , url = "localhost:8090/api/v1/students")
public interface StudentClient {
    @GetMapping("/search-course/{idCourse}")
    List<?> findAllStudentsByCourse(@PathVariable Long idCourse);
}

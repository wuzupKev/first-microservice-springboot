package com.microservice.course.microservicecourse.http.response;

import com.microservice.course.microservicecourse.dto.StudentDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentByCourseResponse {
    private String courseName;
    private String teacher;
    private List<StudentDto>studentDtos;
}

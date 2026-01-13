package com.anand.school.client;

import com.anand.school.dto.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


@FeignClient(name= "STUDENT-SERVICE", url="${application.config.gateway-url}")
public interface StudentClient {
    @GetMapping("/school/{school-id}")
    List<Student> findAllStudentBySchool(@PathVariable("school-id") Integer schoolId);
}

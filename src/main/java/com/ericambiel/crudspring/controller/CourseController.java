package com.ericambiel.crudspring.controller;

import com.ericambiel.crudspring.model.Course;
import com.ericambiel.crudspring.repository.CourseRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // Say to Spring this class contains an endpoint
@RequestMapping("/api/courses") // Say to Spring witch is URL
@AllArgsConstructor // Lombok's annotation, make to us constructor automatically
public class CourseController {
    private final CourseRepository courseRepository;

//    public CourseController(CourseRepository courseRepository) {
//        this.courseRepository = courseRepository;
//    }

    //    @RequestMapping(method = RequestMethod.GET) // Is the same thing above.
    @GetMapping // Say to spring what's the HTTP verb will be used.
    public List<Course> list() {
        return courseRepository.findAll();
    }
}

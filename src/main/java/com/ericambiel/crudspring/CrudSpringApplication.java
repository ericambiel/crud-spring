package com.ericambiel.crudspring;

import com.ericambiel.crudspring.model.Course;
import com.ericambiel.crudspring.repository.CourseRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringApplication.class, args);
	}

	// These lines bellow is only for test, comment to production
	// Say to Spring manage all Life Cycle of this object
	@Bean
	// CommandLineRunner is executed after all object already running in Spring.
	CommandLineRunner initDataBase(CourseRepository courseRepository) {
		return args -> {
			courseRepository.deleteAll();

			Course course = new Course();
			course.setName("Spring and Angular");
			course.setCategory("front-end");

			courseRepository.save(course);
		};
	}
}

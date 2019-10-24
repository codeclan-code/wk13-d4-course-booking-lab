package com.codeclan.example.coursebookingservice;

import com.codeclan.example.coursebookingservice.models.Course;
import com.codeclan.example.coursebookingservice.repositories.CourseRepository.CourseRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CoursebookingserviceApplicationTests {

	@Autowired
	CourseRepository courseRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void findCourseByRating() {
		List<Course> found = courseRepository.findCourseByStarRating(5);
		assertEquals(5, found.get(0).getStarRating());
	}
}

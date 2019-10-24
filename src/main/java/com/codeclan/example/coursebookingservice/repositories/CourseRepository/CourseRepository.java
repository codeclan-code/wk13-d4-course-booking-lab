package com.codeclan.example.coursebookingservice.repositories.CourseRepository;

import com.codeclan.example.coursebookingservice.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {
    List<Course> findCourseByStarRating(int starRating);
}

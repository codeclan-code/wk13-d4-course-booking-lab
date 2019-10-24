package com.codeclan.example.coursebookingservice.repositories;

import com.codeclan.example.coursebookingservice.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}

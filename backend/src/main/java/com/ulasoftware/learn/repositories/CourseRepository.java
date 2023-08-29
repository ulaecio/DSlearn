package com.ulasoftware.learn.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ulasoftware.learn.entities.Course;

public interface CourseRepository extends JpaRepository<Course, Long>{

}

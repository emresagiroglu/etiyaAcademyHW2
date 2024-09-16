package com.emresagiroglu.etiyaAcademy.dao;

import com.emresagiroglu.etiyaAcademy.entity.Course;

import java.util.List;

public interface CourseRepository {
    List<Course> getAll();
    Course getCourseById(int courseId);

    void createCourse(Course course);

    void deleteCourse(Course course);
}

package com.emresagiroglu.etiyaAcademy.service;

import com.emresagiroglu.etiyaAcademy.entity.Course;

import java.util.List;

public interface CourseService {
    List<Course> getAll();
    Course getCourseById(int courseId) throws Exception;
    void createCourse(Course course) throws Exception;

    void deleteCourse(int courseId) throws Exception;

}

package com.emresagiroglu.etiyaAcademy.dao;

import com.emresagiroglu.etiyaAcademy.entity.Course;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryCourseRepository implements CourseRepository {
    List<Course> courses;

    public InMemoryCourseRepository() {
        courses = new ArrayList<Course>();
        courses.addLast(new Course(1,"JAVA Kursu","Yazılım Geliştirici Yetiştirme Kampı - JAVA",1,0.00));
        courses.addLast(new Course(2,"Python Kursu","Yazılım Geliştirici Yetiştirme Kampı - Python",1,79.99));
        courses.addLast(new Course(3,".Net Kursu","Yazılım Geliştirici Yetiştirme Kampı - .Net",1,89.99));
        courses.addLast(new Course(4,"Laravel Kursu","Yazılım Geliştirici Yetiştirme Kampı - Laravel",1,109.99));
        courses.addLast(new Course(5,"Swift Kursu","Yazılım Geliştirici Yetiştirme Kampı - Swift",2,19.99));
    }


    @Override
    public List<Course> getAll() {
        return courses;
    }

    @Override
    public Course getCourseById(int courseId) {
        return courses.get(courseId);
    }

    @Override
    public void createCourse(Course course) {
        courses.addLast(course);
    }

    @Override
    public void deleteCourse(Course course) {
        courses.remove(course);
    }


}

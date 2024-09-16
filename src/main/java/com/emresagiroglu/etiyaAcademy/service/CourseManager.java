package com.emresagiroglu.etiyaAcademy.service;

import com.emresagiroglu.etiyaAcademy.dao.CourseRepository;
import com.emresagiroglu.etiyaAcademy.entity.Course;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CourseManager implements CourseService {
    private CourseRepository courseRepository;

    @Override
    public List<Course> getAll() {
        return courseRepository.getAll();
    }

    @Override
    public Course getCourseById(int courseId) throws Exception{
        if (courseRepository.getAll().size() < courseId || courseId > 0){
            throw new Exception("Course not found!");
        } else{
            return courseRepository.getCourseById(courseId - 1);
        }

    }

    @Override
    public void createCourse(Course course) throws Exception {
        course.setId(courseRepository.getAll().size() + 1);
        if(course.getCourseName() == null || course.getCourseDesc() == null || course.getInstructorId() == 0 || course.getCoursePrice() == 0)
        {
            throw new Exception("Fill the fields!");
        }
        courseRepository.createCourse(course);
    }

    @Override
    public void deleteCourse(int courseId) throws Exception {
        Course removeCourse = courseRepository.getCourseById(courseId - 1);
        if (courseRepository.getAll().contains(removeCourse)){
            courseRepository.deleteCourse(removeCourse);
        }
        else{
            throw new Exception("Course not found!");
        }

    }
}

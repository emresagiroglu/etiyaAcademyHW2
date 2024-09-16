package com.emresagiroglu.etiyaAcademy.control;

import com.emresagiroglu.etiyaAcademy.dao.CourseRepository;
import com.emresagiroglu.etiyaAcademy.entity.Course;
import com.emresagiroglu.etiyaAcademy.service.CourseService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
@AllArgsConstructor
public class CourseController {
    private CourseService courseService;

    @GetMapping
    public List<Course> getAll(){
        return courseService.getAll();
    }

    @GetMapping("/{courseId}")
    public Course getCourseById(@PathVariable("courseId")int courseId) throws Exception{
        return courseService.getCourseById(courseId);
    }

    @PostMapping()
    public void createCourse(@RequestBody Course course) throws Exception{
        courseService.createCourse(course);
    }

    @DeleteMapping("/{courseId}")
    public void deleteCourse(@PathVariable("courseId")int courseId) throws Exception{
        courseService.deleteCourse(courseId);
    }
}

package au.com.jiangren.spaceshuttle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import au.com.jiangren.spaceshuttle.model.Course;
import au.com.jiangren.spaceshuttle.repository.CourseRepository;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/api/v1/")
public class CourseController {

    @Autowired
    private CourseRepository courseRepository;

    @GetMapping(value = "courses")
    public Set<Course> list() {

        /*
        String headerValue = CacheControl.maxAge(10, TimeUnit.SECONDS).getHeaderValue();
        response.addHeader("Cache-Control", headerValue);
        */

        //return CourseMockData.getAllCourses();

        return new HashSet<Course>(courseRepository.findAll());
    }

    @PostMapping(value = "courses")
    public Course create(@RequestBody Course course) {
        //return CourseMockData.createCourse(course);
        return courseRepository.save(course);
    }

    @GetMapping(value = "courses/{id}")
    public Course get(@PathVariable Long id) {
        //return CourseMockData.getCourse(id);

        return courseRepository.findOne(id);
    }

    @PutMapping(value = "courses/{id}")
    public Course update(@PathVariable Long id, @RequestBody Course course) {
        //return CourseMockData.updateCourse(id, course);
        course.setId(id);
        return courseRepository.save(course);
    }

    @DeleteMapping(value = "courses/{id}")
    public Course delete(@PathVariable Long id) {
        // return CourseMockData.deleteCourse(id);
        Course course = courseRepository.findOne(id);
        courseRepository.delete(course);
        return course;
    }

    @GetMapping(value = "courses", params = "name")
    public Collection<Course> get(@RequestParam String name) {
        return Collections.EMPTY_LIST;
//        return courseRepository.iwanttoFindByName1(name);
    }
}

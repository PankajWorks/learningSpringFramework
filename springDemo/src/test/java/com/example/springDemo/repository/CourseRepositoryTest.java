package com.example.springDemo.repository;


import com.example.springDemo.CourseApplication;
import com.example.springDemo.entity.Course;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;


@RunWith(SpringRunner.class)
@SpringBootTest(classes=CourseApplication.class)
public class CourseRepositoryTest {

    @Autowired
    CourseRepository courseRepository;
    @Test
    public void test_01_findbyId(){
        Course course = courseRepository.findById(10001L);
        assertEquals("Spring Boot",course.getName());

    }

    @Test
    @DirtiesContext
    public void test_02_deleteById(){
        courseRepository.deleteById(10001L);
        assertNull(courseRepository.findById(10001L));
    }

    @Test
    @DirtiesContext
    public void test_03_save(){
        Course course = courseRepository.save(new Course("Test Course"));
        assertEquals("Test Course",course.getName());
    }

    @Test
    @DirtiesContext
    public void test_04_update(){
        //Get, updatename, save, select, validate
        Course course = courseRepository.findById(10003L);
        course.setName("Modified the name");
        courseRepository.save(course);
        //check the value
        Course course1 = courseRepository.findById(10003L);
        assertEquals("Modified the name", course1.getName());
    }
}

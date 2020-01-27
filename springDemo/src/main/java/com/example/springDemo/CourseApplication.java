package com.example.springDemo;

import com.example.springDemo.entity.Course;
import com.example.springDemo.repository.CourseRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CourseApplication implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    CourseRepository courseRepository;

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(SpringDemoApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        Course course = courseRepository.findById(10001L);
        logger.info("Course 10001 -> {}", course);
        // Delete a record
        courseRepository.deleteById(10004L);
        courseRepository.save(new Course("Microservices in 100 steps."));
    }
}

package com.example.springDemo.repository;

import com.example.springDemo.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;


@Repository
@Transactional
public class CourseRepository {

    @Autowired
    EntityManager em;

    // public Course findById(Long id)
    public Course findById(Long id){
        return em.find(Course.class, id);
    }
    // public Course save(Course course) -> insert or update

    public Course save(Course course){
        if (course.getId() == null){
            em.persist(course);
        } else {
            em.merge(course);
        }
        return course;
    }
    // public void deleteById(Long id)
    public void deleteById(Long id){
        Course course = this.findById(id);
        em.remove(course);
    }

}

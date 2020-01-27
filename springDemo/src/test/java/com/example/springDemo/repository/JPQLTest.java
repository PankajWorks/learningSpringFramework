package com.example.springDemo.repository;

import com.example.springDemo.CourseApplication;
import com.example.springDemo.entity.Course;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes= CourseApplication.class)
public class JPQLTest {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    EntityManager em;
    @Test
    public void test_01_jpql(){
        List resultList = em.createQuery("select c from Course c").getResultList();
        logger.info("select c from Course c {}", resultList);
    }

    @Test
    public void test_02_jpql_typed(){
        TypedQuery<Course> query =  em.createQuery("select c from Course c", Course.class);
        List<Course> courseList = query.getResultList();
        logger.info("select c from Course c {}", courseList);
    }

    @Test
    public void test_02_jpql_where(){
        TypedQuery<Course> query =  em.createQuery("select c from Course c where name like '%Python'", Course.class);
        List<Course> courseList = query.getResultList();
        logger.info("select c from Course c {}", courseList);
    }
}
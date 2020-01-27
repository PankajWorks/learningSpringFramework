package com.example.springDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDemoApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(getClass());
	@Autowired
	PersonJDBCDao personJDBCDao;
	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SpringDemoApplication.class, args);
//		for (String name : applicationContext.getBeanDefinitionNames()){
//			System.out.println("Bean Name" + name);
//		}
	}

	@Override
	public void run(String... args) throws Exception {
		//logger.info(personJDBCDao.findAll().toString());
	}
}

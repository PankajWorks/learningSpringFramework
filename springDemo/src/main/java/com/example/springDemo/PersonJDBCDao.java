package com.example.springDemo;

import com.example.springDemo.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class PersonJDBCDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    class PersonRowMapper implements RowMapper<Person>{

        @Override
        public Person mapRow(ResultSet resultSet, int i) throws SQLException {
            Person person = new Person();
            person.setId(resultSet.getInt("id"));
            person.setName(resultSet.getString("name"));
            person.setLocation(resultSet.getString("location"));
            //person.setBirthDate(resultSet.getDate("birthDate"));
            return person;
        }
    }
    public List<Person> findAll(){
        //return jdbcTemplate.query("Select * from Person", new BeanPropertyRowMapper(Person.class));
        return jdbcTemplate.query("Select * from Person", new PersonRowMapper());
    }
    // Select * from Person

}

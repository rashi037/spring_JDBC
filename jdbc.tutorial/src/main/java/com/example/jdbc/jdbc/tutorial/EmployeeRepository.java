package com.example.jdbc.jdbc.tutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;


import java.awt.*;

@Repository
public class EmployeeRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;
    public List<Employee> findAll(){
        return jdbcTemplate.query("select * from employee" , new BeanPropertyRowMapper<Employee>(Employee.class));
    }

    public Employee findById(int id){
        return jdbcTemplate.queryForObject("select * from employee where id =? " ,new BeanPropertyRowMapper<Employee>(Employee.class) , id);
    }

    public int deleteById(int id){
        return jdbcTemplate.update("delete from employee where id = ?", id);
                //No row mapper needed
    }

    public int addEmployee(Employee employee){
        return jdbcTemplate.update("insert into employee(id, name, location, department, date_of_birth) values(?, ?, ?, ?, ?)",
                employee.getId(), employee.getName(), employee.getLocation(), employee.getDepartment(), employee.getDateOfBirth());

    }


}


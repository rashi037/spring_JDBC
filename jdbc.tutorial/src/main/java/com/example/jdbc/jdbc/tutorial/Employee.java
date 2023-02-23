package com.example.jdbc.jdbc.tutorial;

import java.util.Date;

public class Employee {
    private int id;
    private String name;
    private String location;
    private String department;
    private Date dateOfBirth;
    public Employee() {
    }

    public Employee(int id, String name, String location, String department, Date dateOfBirth) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.department = department;
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", department='" + department + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}

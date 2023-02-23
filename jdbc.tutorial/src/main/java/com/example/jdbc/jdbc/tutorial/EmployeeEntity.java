package com.example.jdbc.jdbc.tutorial;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



// shows meta data
@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@ToString
@Table(name="EMPLOYEE")

public class EmployeeEntity<> {
    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "LOCATION")
    private String location;

    @Column(name = "DEPARTMENT")
    private String department;

    @Column(name = "DATE_OF_BIRTH")
    private String dateofbirth;


}

package com.example.jdbc.jdbc.tutorial;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface IEmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {
    @Override
    List<EmployeeEntity> findAll();

    @Override
    Optional<EmployeeEntity> findById(Integer integer);

    List<EmployeeEntity> findByLocation(String location);

}

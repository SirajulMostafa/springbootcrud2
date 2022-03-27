package com.springbootcrud2.springbootcrud2.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springbootcrud2.springbootcrud2.domain.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long>{ 
}

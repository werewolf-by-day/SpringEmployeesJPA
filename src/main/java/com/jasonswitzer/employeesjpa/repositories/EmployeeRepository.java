package com.jasonswitzer.employeesjpa.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jasonswitzer.employeesjpa.models.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long>{

}

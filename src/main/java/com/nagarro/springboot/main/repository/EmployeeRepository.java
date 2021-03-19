package com.nagarro.springboot.main.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nagarro.springboot.main.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer>
{
	
}

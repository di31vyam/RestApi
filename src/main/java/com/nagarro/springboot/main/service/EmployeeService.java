package com.nagarro.springboot.main.service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.nagarro.springboot.main.model.Employee;
import com.nagarro.springboot.main.repository.EmployeeRepository;

@Service
public class EmployeeService 
{
	@Autowired
	EmployeeRepository er;
	
	public ResponseEntity<List<Employee>> getAll()
	{
		List<Employee> l= (List<Employee>) er.findAll();
		if(l.size()==0)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(l));
	}
	public ResponseEntity<Employee> update(Employee employee) 
	{
		Employee em=null;
		try
		{
			em=er.save(employee);
			return ResponseEntity.status(HttpStatus.CREATED).build();
		}
		catch(Exception e)
		{
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	public ResponseEntity<Employee> upload(Employee e)
	{
		Employee em=null;
		try
		{
			em=er.save(e);
			return ResponseEntity.status(HttpStatus.CREATED).build();
		}
		catch(Exception ee)
		{
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
}

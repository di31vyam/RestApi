package com.nagarro.springboot.main.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.springboot.main.model.Employee;
import com.nagarro.springboot.main.service.EmployeeService;

@RestController
@RequestMapping(value="api/employee")
public class EmployeeController 
{
	@Autowired
	EmployeeService es;
	
	@GetMapping(value = "/get")
	public ResponseEntity<List<Employee>> getEmployees() 
	{
		ResponseEntity<List<Employee>> l=es.getAll();
		return l;
	}
	
	@PutMapping(value = "/update")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee) 
	{
		return es.update(employee);
		
	}
	
	@PostMapping(value = "/upload")
	public ResponseEntity<Employee> addEmployees(@RequestBody Employee employee) 
	{
		return es.upload(employee);
	}
}

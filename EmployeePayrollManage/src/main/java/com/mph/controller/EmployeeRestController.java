package com.mph.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//import com.mph.entity.Developer;
//import com.mph.entity.Designer;
//import com.mph.entity.TestEngg;
import com.mph.entity.Employee;
import com.mph.service.EmployeeService;

@RestController
@RequestMapping("/employee")
@CrossOrigin(allowCredentials = "false", allowedHeaders = "*", origins = "http://localhost:4200", methods = {
	RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
public class EmployeeRestController {

	
	@Autowired
	public EmployeeService employeeService;

	
		@PostMapping("/cemployee")
	public Employee createE(@RequestBody Employee employee) {
		employeeService.createE(employee);
	return employee;
	}
	
//	@PostMapping("/createdeveloper")
//	public Employee createD(@RequestBody Developer developer) {
//		employeeService.createD(developer);
//	return developer;
//	}
	
//	@PostMapping("/createtestengg")
//	public Employee createTe(@RequestBody TestEngg testEngg) {
//		employeeService.createTe(testEngg);
//	return testEngg;
//	}
	
//	@PostMapping("/createdesigner")
//	public Employee createDe(@RequestBody Designer designer) {
//		employeeService.createDe(designer);
//		return designer;
//		
//	}
	
	 @GetMapping("/allemps")
		 public ResponseEntity<List<Employee>> listAllEmp() {
		 	List<Employee> li = employeeService.getAllEmps();
		 	if (li.isEmpty()) {
		 		return new ResponseEntity<List<Employee>>(HttpStatus.NO_CONTENT);
		 	}

			return new ResponseEntity<List<Employee>>(li, HttpStatus.OK);
		 }
	
	@PutMapping("/updateemp/{eid}")
	public ResponseEntity<List<Employee>> updateEmp(@RequestBody Employee employee) {
		List<Employee> li = employeeService.updateEmp(employee);
		
		if (li.isEmpty()) {
			return new ResponseEntity<List<Employee>>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<List<Employee>>(li,HttpStatus.OK);
	}
	
	
	@DeleteMapping("/deleteemp/{eid}")
	public ResponseEntity<List<Employee>> deleteEmp(@PathVariable("eid") int eid) {
		List<Employee> li = employeeService.deleteEmp(eid);
		if (li.isEmpty()) {
			return new ResponseEntity<List<Employee>>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<List<Employee>>(li,HttpStatus.OK);
	}
	
}

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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mph.entity.Employee;
import com.mph.entity.SalaryE;
import com.mph.service.SalaryEService;




@RestController
@RequestMapping("/s")
@CrossOrigin(allowCredentials = "false", allowedHeaders = "*", origins = "http://localhost:4200", methods = {
		RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
public class SalaryERestController {
	@Autowired
	SalaryEService salaryService;
	
	
	@PostMapping("/createsal")
	public SalaryE createSalary(@RequestBody SalaryE s) {
		salaryService.createSalary(s);
		return s;
	}
	
	 @GetMapping("/listsalary")
	 public ResponseEntity<List<SalaryE>> ListSalary(SalaryE s) {
	 	List<SalaryE> li = salaryService.ListSalary();
	 	if (li.isEmpty()) {
	 		return new ResponseEntity<List<SalaryE>>(HttpStatus.NO_CONTENT);
	 	}

		return new ResponseEntity<List<SalaryE>>(li, HttpStatus.OK);
	 }
	
	 @DeleteMapping("/deletesalary/{salId}")
		public ResponseEntity<List<SalaryE>> deleteSalary(@PathVariable("salId")int salid) {
			List<SalaryE> li = salaryService.deleteSalary(salid);
			if (li.isEmpty()) {
				return new ResponseEntity<List<SalaryE>>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<List<SalaryE>>(li,HttpStatus.OK);
		}
	
}

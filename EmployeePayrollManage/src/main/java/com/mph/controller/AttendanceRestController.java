package com.mph.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mph.entity.AllDetail;
import com.mph.entity.Attendance;


import com.mph.service.AttendanceService;


@RestController
@RequestMapping("/attendance")
@CrossOrigin(allowCredentials = "false", allowedHeaders = "*", origins = "http://localhost:4200", methods = {
		RequestMethod.GET, RequestMethod.POST })
public class AttendanceRestController {

	@Autowired
	public AttendanceService attendanceService;
	
	@PostMapping("/createAtt")
	public Attendance addattendance(@RequestBody Attendance attendance) {
		attendanceService.createAttendance(attendance);
	return attendance;
	}
	
	
	
	
}

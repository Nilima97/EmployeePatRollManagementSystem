package com.mph.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mph.dao.AttendanceDao;

import com.mph.entity.Attendance;
@Service
@Transactional
public class AttendanceServiceImpl implements AttendanceService{
	@Autowired
	public AttendanceDao attendanceDao;

	@Override
	public void createAttendance(Attendance attendance) {
		attendanceDao.createAttendance(attendance);
		
	}

	@Override
	public Attendance getAttendance(int employeeid) {
		return attendanceDao.getAttendance(employeeid);
	}

}

package com.mph.service;

import com.mph.entity.Attendance;

public interface AttendanceService {
	public void createAttendance(Attendance attendance);
	public  Attendance getAttendance(int employeeid);


}

package com.mph.dao;

import com.mph.entity.Attendance;



public interface AttendanceDao {
	public void createAttendance(Attendance attendance);
	public  Attendance getAttendance(int employeeid);

}

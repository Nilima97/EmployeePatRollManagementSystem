package com.mph.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Attendance {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
    private String employeeid;
	private String name;
	private String email;
	private String todaydate;
	private String status;
	public Attendance() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Attendance(String employeeid, String name, String email, String todaydate, String status) {
		super();
		this.employeeid = employeeid;
		this.name = name;
		this.email = email;
		this.todaydate = todaydate;
		this.status = status;
	}
	public String getEmployeeid() {
		return employeeid;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getTodaydate() {
		return todaydate;
	}
	public String getStatus() {
		return status;
	}
	public void setEmployeeid(String employeeid) {
		this.employeeid = employeeid;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setTodaydate(String todaydate) {
		this.todaydate = todaydate;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Attendance [employeeid=" + employeeid + ", name=" + name + ", email=" + email + ", todaydate="
				+ todaydate + ", status=" + status + "]";
	}
	
	
}
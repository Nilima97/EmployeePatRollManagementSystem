package com.mph.entity;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

//@Inheritance(strategy= InheritanceType.JOINED)
//@DiscriminatorColumn(name = "E_TYPES")
@Entity

public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int eid;

	private String ename;
	private String email;
	private int doj;
	private String role;
	private int dob;
	private String addr;
	private String password;
	private double phone;
	private String pan;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int eid, String ename, String email, int doj, String role, int dob, String addr, String password,
			double phone, String pan) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.email = email;
		this.doj = doj;
		this.role = role;
		this.dob = dob;
		this.addr = addr;
		this.password = password;
		this.phone = phone;
		this.pan = pan;

	}

	public int getEid() {
		return eid;
	}

	public String getEname() {
		return ename;
	}

	public String getEmail() {
		return email;
	}

	public int getDoj() {
		return doj;
	}

	public String getRole() {
		return role;
	}

	public int getDob() {
		return dob;
	}

	public String getAddr() {
		return addr;
	}

	public String getPassword() {
		return password;
	}

	

	public String getPan() {
		return pan;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setDoj(int doj) {
		this.doj = doj;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public void setDob(int dob) {
		this.dob = dob;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	

	public double getPhone() {
		return phone;
	}

	public void setPhone(double phone) {
		this.phone = phone;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", email=" + email + ", doj=" + doj + ", role=" + role
				+ ", dob=" + dob + ", addr=" + addr + ", password=" + password + ", phone=" + phone + ", pan=" + pan
				+ "]";
	}

}

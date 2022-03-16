package com.mph.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AllDetail {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int aid;
	private String employeeid;
	private String adate;
	private String logon;
	private String logoff;
	
	public AllDetail() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AllDetail(int aid, String employeeid, String adate, String logon, String logoff) {
		super();
		this.aid = aid;
		this.employeeid = employeeid;
		this.adate = adate;
		this.logon = logon;
		this.logoff = logoff;
	}

	public int getAid() {
		return aid;
	}

	public String getEmployeeid() {
		return employeeid;
	}

	public String getAdate() {
		return adate;
	}

	public String getLogon() {
		return logon;
	}

	public String getLogoff() {
		return logoff;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public void setEmployeeid(String employeeid) {
		this.employeeid = employeeid;
	}

	public void setAdate(String adate) {
		this.adate = adate;
	}

	public void setLogon(String logon) {
		this.logon = logon;
	}

	public void setLogoff(String logoff) {
		this.logoff = logoff;
	}

	@Override
	public String toString() {
		return "AttDetail [aid=" + aid + ", employeeid=" + employeeid + ", adate=" + adate + ", logon=" + logon
				+ ", logoff=" + logoff + "]";
	}
	
	
}

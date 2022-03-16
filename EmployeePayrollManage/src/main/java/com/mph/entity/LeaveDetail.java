package com.mph.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LeaveDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int lid;
	private String empid;
	private String ltype;
	private String reason;
	private String fromdate;
	private String todate;
	
	public LeaveDetail() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LeaveDetail(int lid, String empid, String ltype, String reason, String fromdate, String todate) {
		super();
		this.lid = lid;
		this.empid = empid;
		this.ltype = ltype;
		this.reason = reason;
		this.fromdate = fromdate;
		this.todate = todate;
	}

	public int getLid() {
		return lid;
	}

	public String getEmpid() {
		return empid;
	}

	public String getLtype() {
		return ltype;
	}

	public String getReason() {
		return reason;
	}

	public String getFromdate() {
		return fromdate;
	}

	public String getTodate() {
		return todate;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public void setLtype(String ltype) {
		this.ltype = ltype;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public void setFromdate(String fromdate) {
		this.fromdate = fromdate;
	}

	public void setTodate(String todate) {
		this.todate = todate;
	}

	@Override
	public String toString() {
		return "LeaveDetail [lid=" + lid + ", empid=" + empid + ", ltype=" + ltype + ", reason=" + reason
				+ ", fromdate=" + fromdate + ", todate=" + todate + "]";
	}

	

	}

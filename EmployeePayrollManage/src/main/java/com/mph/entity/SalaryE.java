package com.mph.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class SalaryE {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int salId;
	private int empId;
	private Double pfAmount;
	private String tranDate;
	private Double basicPay;
	private Double da;
	private Double hra;
	private Double grossSalary;
	private Double tax;
	private Double deduction;
	private Double netPay;

	public SalaryE() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SalaryE(int salId, int empId, Double pfAmount, String tranDate, Double basicPay, Double da, Double hra,
			Double grossSalary, Double tax, Double deduction, Double netPay) {
		super();
		this.salId = salId;
		this.empId = empId;
		this.pfAmount = pfAmount;
		this.tranDate = tranDate;
		this.basicPay = basicPay;
		this.da = da;
		this.hra = hra;
		this.grossSalary = grossSalary;
		this.tax = tax;
		this.deduction = deduction;
		this.netPay = netPay;
	}

	public int getSalId() {
		return salId;
	}

	public int getEmpId() {
		return empId;
	}

	public Double getPfAmount() {
		return pfAmount;
	}

	public String getTranDate() {
		return tranDate;
	}

	public Double getBasicPay() {
		return basicPay;
	}

	public Double getDa() {
		return da;
	}

	public Double getHra() {
		return hra;
	}

	public Double getGrossSalary() {
		return grossSalary;
	}

	public Double getTax() {
		return tax;
	}

	public Double getDeduction() {
		return deduction;
	}

	public Double getNetPay() {
		return netPay;
	}

	public void setSalId(int salId) {
		this.salId = salId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setPfAmount(Double pfAmount) {
		this.pfAmount = pfAmount;
	}

	public void setTranDate(String tranDate) {
		this.tranDate = tranDate;
	}

	public void setBasicPay(Double basicPay) {
		this.basicPay = basicPay;
	}

	public void setDa(Double da) {
		this.da = da;
	}

	public void setHra(Double hra) {
		this.hra = hra;
	}

	public void setGrossSalary(Double grossSalary) {
		this.grossSalary = grossSalary;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	public void setDeduction(Double deduction) {
		this.deduction = deduction;
	}

	public void setNetPay(Double netPay) {
		this.netPay = netPay;
	}

	@Override
	public String toString() {
		return "SalaryE [salId=" + salId + ", empId=" + empId + ", pfAmount=" + pfAmount + ", tranDate=" + tranDate
				+ ", basicPay=" + basicPay + ", da=" + da + ", hra=" + hra + ", grossSalary=" + grossSalary + ", tax="
				+ tax + ", deduction=" + deduction + ", netPay=" + netPay + "]";
	}

}

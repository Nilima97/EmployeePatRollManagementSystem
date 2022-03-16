package com.mph.service;

import java.util.List;

import com.mph.entity.SalaryE;

public interface SalaryEService {
	public void createSalary(SalaryE s);
	public List<SalaryE> ListSalary();
	public List<SalaryE> deleteSalary(int salid);
	public List<SalaryE> updateSalary(SalaryE s);
	
}

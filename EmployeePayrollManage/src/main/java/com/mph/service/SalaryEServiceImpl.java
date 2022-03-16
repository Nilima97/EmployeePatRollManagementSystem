package com.mph.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mph.dao.SalaryEDao;
import com.mph.entity.SalaryE;

@Service
@Transactional
public class SalaryEServiceImpl implements SalaryEService {
	
	@Autowired
	SalaryEDao salaryeDao;
	
	@Override
	public void createSalary(SalaryE s) {
		salaryeDao.createSalary(s);
		
	}

	@Override
	public List<SalaryE> ListSalary() {
		
		return salaryeDao.ListSalary() ;
	}

	

	@Override
	public List<SalaryE> updateSalary(SalaryE s) {
		return salaryeDao.updateSalary(s);
	}

	@Override
	public List<SalaryE> deleteSalary(int salid) {
		return salaryeDao.deleteSalary(salid);
	}

	

}

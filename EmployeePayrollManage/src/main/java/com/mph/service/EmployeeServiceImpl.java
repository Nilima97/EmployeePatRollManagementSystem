package com.mph.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mph.dao.EmployeeDao;
//import com.mph.entity.Developer;
//import com.mph.entity.Designer;
//import com.mph.entity.TestEngg;
import com.mph.entity.Employee;
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	public EmployeeDao employeeDao;

	@Override
	public void createE(Employee employee) {
		employeeDao.createE(employee);
		
	}

//	@Override
//	public void createD(Developer developer) {
//		employeeDao.createD(developer);
//		
//	}

//	@Override
//	public void createTe(TestEngg testEngg) {
//		employeeDao.createTe(testEngg);
//		
//	}

//	@Override
//	public void createDe(Designer designer) {
//		employeeDao.createDe(designer);		
//	}

	@Override
	public List<Employee> getAllEmps() {
		return employeeDao.getAllEmps();
		
	}

	@Override
	public Employee getEmp(int eid) {
		return employeeDao.getEmp(eid);
	}

	@Override
	public List<Employee> updateEmp(Employee employee) {
		return employeeDao.updateEmp(employee);
	}

	@Override
	public List<Employee> deleteEmp(int eid) {
		return employeeDao.deleteEmp(eid);
	}

	

	
}

package com.mph.service;

import java.util.List;

//import com.mph.entity.Developer;
//import com.mph.entity.Designer;
//import com.mph.entity.TestEngg;
import com.mph.entity.Employee;

public interface EmployeeService {
	public void createE(Employee employee);
	public List<Employee> getAllEmps();
	public  Employee getEmp(int eid);
	public  List<Employee> updateEmp(Employee employee);
	public List<Employee> deleteEmp(int eid);

//	public void createD(Developer developer);
//	public List<E> updateDev(E e);
//	public List<E> deleteDev(int eid);

//	public void createTe(TestEngg testEngg);
//	public List<E> updateTe(E e);
//	public List<E> deleteTe(int eid);

//	public void createDe(Designer designer);
//	public List<E> updateDe(E e);
//	public List<E> deleteDe(int eid);
}

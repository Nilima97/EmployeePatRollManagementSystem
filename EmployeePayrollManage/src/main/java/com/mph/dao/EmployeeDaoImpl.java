package com.mph.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

//import com.mph.entity.Developer;
//import com.mph.entity.Designer;
//import com.mph.entity.TestEngg;
import com.mph.entity.Employee;
@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void createE(Employee employee) {
		getSession().saveOrUpdate(employee);
		System.out.println("Employee Saved successfully...");

		
	}

//	@Override
//	public void createD(Developer developer) {
//		getSession().saveOrUpdate(developer);
//		System.out.println("Developer Saved successfully...");
//
//	}

//	@Override
//	public void createTe(TestEngg testEngg) {
//		getSession().saveOrUpdate(testEngg);	
//		System.out.println("Test Engg Saved successfully...");
//
//	}

//	@Override
//	public void createDe(Designer designer) {
//		getSession().saveOrUpdate(designer);
//		System.out.println("Designer Saved successfully...");
//
//	}

	@Override
	public List<Employee> getAllEmps() {
		 Query qry = getSession().createQuery("select e from Employee e");
		 List<Employee> elist = qry.list();
		// Collections.sort(elist,new ProductComparator());
		 System.out.println("Employee  list from dao : " + elist);
		 return elist;
		
	}

	@Override
	public Employee getEmp(int eid) {
		Query qry = getSession().createQuery("From Employee e where eid=:id");
		qry.setParameter("id", eid);
		Employee employee = (Employee) qry.uniqueResult();
		System.out.println("search result : " + employee);
		return employee;
		
	}

	@Override
	public List<Employee> updateEmp(Employee employee) {
		Query qry = getSession().createQuery(" update Employee  e set email=:email,role=:role,addr=:addr,phone=:phone");
//		qry.setParameter("Employee", employee.getEname());
		qry.setParameter("email", employee.getEmail());
//		qry.setParameter("Employee", employee.getDoj());
		qry.setParameter("role", employee.getRole());
//		qry.setParameter("Employee", employee.getDob());
		qry.setParameter("addr", employee.getAddr());
//		qry.setParameter("Employee", employee.getPassword());
		qry.setParameter("phone", employee.getPhone());
//		qry.setParameter("Employee", employee.getPan());
	
		
		int noofrows = qry.executeUpdate();
		if (noofrows > 0) {
			System.out.println("Updated " + noofrows + " rows. ");
		}
		return getAllEmps();
	}
		

	@Override
	public List<Employee> deleteEmp(int eid) {
		Query qry = getSession().createQuery(" delete Employee  e where eid=:eid");
		qry.setParameter("eid", eid);
		int noofrows = qry.executeUpdate();
		if (noofrows > 0) {
			System.out.println("Deleted " + noofrows + " rows. ");
		}
		return getAllEmps();		
	}

	

	

	

}

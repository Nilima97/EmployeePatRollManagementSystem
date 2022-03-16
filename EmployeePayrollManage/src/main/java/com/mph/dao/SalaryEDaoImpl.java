package com.mph.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mph.entity.SalaryE;



@Repository
public class SalaryEDaoImpl implements SalaryEDao {
	
	@Autowired
   private SessionFactory sessionFactory;
	
	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public void createSalary(SalaryE s) {
		s.setGrossSalary(s.getBasicPay() + s.getDa() + s.getHra());
	    s.setDeduction(s.getPfAmount() + s.getTax());	
	    s.setNetPay(s.getGrossSalary() - s.getDeduction());
	    getSession().saveOrUpdate(s);
			System.out.println("Salary Saved successfully...");
		
	}

	@Override
	public List<SalaryE> ListSalary() {
		Query qry = getSession().createQuery("select sal from SalaryE sal");
		 List<SalaryE> listOfSal = qry.list();
		 System.out.println("Salary  list from dao : " + listOfSal);
		 return listOfSal;
	}

	@Override
	public List<SalaryE> deleteSalary(int salid) {
		Query qry = getSession().createQuery(" delete SalaryE sal where salId=:salId");
		qry.setParameter("salId", salid);
		int noofrows = qry.executeUpdate();
		if (noofrows > 0) {
			System.out.println("Deleted " + noofrows + " rows. ");
		}
		return ListSalary();
	}

	@Override
	public List<SalaryE> updateSalary(SalaryE s) {
		
		return null;
	}

}

package com.mph.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mph.entity.Attendance;


@Repository
public class AttendanceDaoImpl implements AttendanceDao{
	@Autowired
	   private SessionFactory sessionFactory;
		
		protected Session getSession() {
			return sessionFactory.getCurrentSession();
		}

		@Override
		public void createAttendance(Attendance attendance) {
			getSession().saveOrUpdate(attendance);
			System.out.println("Attendence Saved successfully...");

		}

		@Override
		public Attendance getAttendance(int employeeid) {
			Query qry = getSession().createQuery("select attendence from Attendence where employeeid=:id");
			qry.setParameter("id", employeeid);
			Attendance attendance = (Attendance) qry.uniqueResult();
			System.out.println("search result : " + attendance);
			return attendance;
			
		}
		
		
			
		
}

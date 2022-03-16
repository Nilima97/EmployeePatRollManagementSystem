package com.mph.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mph.entity.AllDetail;
@Repository
public class AllDetailDaoImpl implements AllDetailDao{
	
	@Autowired
	private SessionFactory sessionFactory;

	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	
	@Override
	public void createAttDetail(AllDetail allDetail) {
		getSession().saveOrUpdate(allDetail);
		System.out.println("AttDetail Saved successfully...");		
	}

	@Override
	public List<AllDetail> getAllAttDetail() {
		Query qry = getSession().createQuery("select a from AllDetail a");
		List<AllDetail> attdetaillist = qry.list();
		System.out.println("emp list from dao : " + attdetaillist);
		return attdetaillist;
	}

}

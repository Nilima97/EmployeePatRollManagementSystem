package com.mph.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mph.dao.AllDetailDao;
import com.mph.entity.AllDetail;

@Service
@Transactional
public class AllDetailServiceImpl implements AllDetailService{
	@Autowired
	public AllDetailDao attDetailDao;

	@Override
	public void createAttDetail(AllDetail allDetail) {
		attDetailDao.createAttDetail(allDetail);
		
	}

	@Override
	public List<AllDetail> getAllAttDetail() {
		return attDetailDao.getAllAttDetail();

	}
	
	
}

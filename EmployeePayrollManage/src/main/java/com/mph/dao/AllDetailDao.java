package com.mph.dao;

import java.util.List;

import com.mph.entity.AllDetail;

public interface AllDetailDao {
	public void createAttDetail(AllDetail allDetail);
	public List<AllDetail> getAllAttDetail();
}

package com.dpxt.service;

import java.util.List;

import com.dpxt.domin.Yingting;

public class YingTingServiceImpl extends BasicService implements YingTingService {

	public List findAll() {
		
		return dao.findAll();
	}

	public Yingting findById(Long obj) {
		// TODO Auto-generated method stub
		Yingting list =(Yingting) dao.findById(obj);
		return list;
	}



}

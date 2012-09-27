package com.dpxt.service;

import java.util.List;

import com.dpxt.domin.Fangying;


public class FangYingServiceImpl extends BasicService implements FangYingService {

	public List findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	public Fangying findById(Long obj) {
		// TODO Auto-generated method stub
		Fangying list =(Fangying) dao.findById(obj);
		return list;
	}

	public List findByProperty(String propertyName, Object value) {
		// TODO Auto-generated method stub
		return dao.findByProperty(propertyName, value);
	}
}
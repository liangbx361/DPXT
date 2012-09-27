package com.dpxt.service;

import java.util.List;

import com.dpxt.domin.Piao;


public class PserviceImpl  extends BasicService implements Pservice {

	public Piao findById(Long obj) {
		// TODO Auto-generated method stub
		System.out.println("dsaddasdasdasd");
		Piao list =(Piao) dao.findById(obj);
		return list;
	}

	public List findByProperty(String propertyName, Object value) {
		// TODO Auto-generated method stub
		return dao.findByProperty(propertyName, value);
	}

}

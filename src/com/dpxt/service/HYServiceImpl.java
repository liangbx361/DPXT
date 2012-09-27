package com.dpxt.service;

import java.util.List;

import com.dpxt.domin.Huiyuan;

public class HYServiceImpl extends BasicService implements HYService {

	public List findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	public Huiyuan findById(Long obj) {
		// TODO Auto-generated method stub
		Huiyuan list =(Huiyuan) dao.findById(obj);
		return list;
	}

	public List findByProperty(String propertyName, Object value) {
		// TODO Auto-generated method stub
		return dao.findByProperty(propertyName, value);
	}

	public void attachDirty(Huiyuan obj) {
		// TODO Auto-generated method stub
		dao.attachDirty(obj);
	}

}

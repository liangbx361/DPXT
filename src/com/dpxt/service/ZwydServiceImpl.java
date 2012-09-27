package com.dpxt.service;

import java.util.List;

import com.dpxt.domin.Yingting;
import com.dpxt.domin.Zwyd;

public class ZwydServiceImpl extends BasicService implements ZwydService {

	public List findByProperty(String propertyName, Object value) {
		// TODO Auto-generated method stub
		return dao.findByProperty(propertyName, value);
	}

	public void attachDirty(Object obj) {
		// TODO Auto-generated method stub
		dao.attachDirty(obj);
	}

	public Zwyd findById(Long id) {
		// TODO Auto-generated method stub
		Zwyd list =(Zwyd) dao.findById(id);
		return list;
	}

}

package com.dpxt.service;

import java.util.List;

import com.dpxt.domin.Yingpian;

public class YingPianServiceImpl extends BasicService implements YingPianService {

	public List findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	public Yingpian findById(Long obj) {
		// TODO Auto-generated method stub
		Yingpian list =(Yingpian) dao.findById(obj);
		return list;
	}

}

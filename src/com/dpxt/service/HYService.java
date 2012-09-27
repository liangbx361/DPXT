package com.dpxt.service;

import java.util.List;

import com.dpxt.domin.Huiyuan;

public interface HYService {

	List findAll();
	Huiyuan findById(Long obj);
	List findByProperty(String propertyName, Object value);
	public void attachDirty(Huiyuan obj);
}

package com.dpxt.service;

import java.util.List;

import com.dpxt.domin.Zwyd;

public interface ZwydService {

	public List findByProperty(String propertyName, Object value);
	public void attachDirty(Object obj);
	public Zwyd findById(Long id);
}

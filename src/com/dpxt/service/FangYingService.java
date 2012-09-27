package com.dpxt.service;

import java.util.List;

import com.dpxt.domin.Fangying;

public interface FangYingService {
	
	List findAll();
	Fangying findById(Long obj);
	List findByProperty(String propertyName, Object value);
}

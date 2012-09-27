package com.dpxt.service;

import java.util.List;

import com.dpxt.domin.Piao;

public interface Pservice {
	
	Piao findById(Long obj);
	List findByProperty(String propertyName, Object value);
}

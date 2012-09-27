package com.dpxt.service;

import java.util.List;

import com.dpxt.domin.Yingting;

public interface YingTingService {

	List findAll();
	Yingting findById(Long obj);
}

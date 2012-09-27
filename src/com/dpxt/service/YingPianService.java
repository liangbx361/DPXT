package com.dpxt.service;

import java.util.List;

import com.dpxt.domin.Yingpian;

public interface YingPianService {
	
	List findAll();
	Yingpian findById(Long obj);
}

package com.dpxt.service;

import com.dpxt.dao.hbn.BasicDao;

public abstract class BasicService {
	protected  BasicDao dao;
	public BasicDao getDao() {
		return dao;
	}
	public void setDao(BasicDao dao) {
		this.dao = dao;
	}
}

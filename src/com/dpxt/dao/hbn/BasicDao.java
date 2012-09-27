package com.dpxt.dao.hbn;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.dpxt.domin.Yingpian;



public abstract class BasicDao extends HibernateDaoSupport{
	
	public abstract void save(Object obj);
	public abstract void delete(Object obj);
	public abstract Object findById(Long id);
	public abstract List findAll();
	public abstract void attachDirty(Object obj);
	public abstract List findByProperty(String propertyName, Object value);	
}

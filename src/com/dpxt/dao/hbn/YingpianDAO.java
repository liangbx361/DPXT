package com.dpxt.dao.hbn;

import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.dpxt.domin.Yingpian;

/**
 * Data access object (DAO) for domain model class Yingpian.
 * 
 * @see com.dpxt.domin.Yingpian
 * @author MyEclipse Persistence Tools
 */

public class YingpianDAO extends BasicDao {
	private static final Log log = LogFactory.getLog(YingpianDAO.class);

	// property constants
	public static final String YPNAME = "ypname";

	protected void initDao() {
		// do nothing
	}

	public void save(Yingpian transientInstance) {
		log.debug("saving Yingpian instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Yingpian persistentInstance) {
		log.debug("deleting Yingpian instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Yingpian findById(java.lang.Long id) {
		log.debug("getting Yingpian instance with id: " + id);
		try {
			Yingpian instance = (Yingpian) getHibernateTemplate().get(
					"com.dpxt.domin.Yingpian", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Yingpian instance) {
		log.debug("finding Yingpian instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Yingpian instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Yingpian as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByYpname(Object ypname) {
		return findByProperty(YPNAME, ypname);
	}

	public List findAll() {
		log.debug("finding all Yingpian instances");
		try {
			String queryString = "from Yingpian";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Yingpian merge(Yingpian detachedInstance) {
		log.debug("merging Yingpian instance");
		try {
			Yingpian result = (Yingpian) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Yingpian instance) {
		log.debug("attaching dirty Yingpian instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Yingpian instance) {
		log.debug("attaching clean Yingpian instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static YingpianDAO getFromApplicationContext(ApplicationContext ctx) {
		return (YingpianDAO) ctx.getBean("YingpianDAO");
	}
	@Override
	public void attachDirty(Object obj) {
		// TODO Auto-generated method stub
		this.attachDirty(obj);
	}

	@Override
	public void delete(Object obj) {
		// TODO Auto-generated method stub
		this.delete(obj);
	}	
	

	@Override
	public void save(Object obj) {
		// TODO Auto-generated method stub
		this.save(obj);
	}


}
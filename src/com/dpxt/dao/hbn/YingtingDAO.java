package com.dpxt.dao.hbn;

import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.dpxt.domin.Yingting;

/**
 * Data access object (DAO) for domain model class Yingting.
 * 
 * @see com.dpxt.domin.Yingting
 * @author MyEclipse Persistence Tools
 */

public class YingtingDAO extends BasicDao {
	private static final Log log = LogFactory.getLog(YingtingDAO.class);

	// property constants
	public static final String YTNAME = "ytname";

	public static final String HANG = "hang";

	public static final String LIE = "lie";

	protected void initDao() {
		// do nothing
	}

	public void save(Yingting transientInstance) {
		log.debug("saving Yingting instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Yingting persistentInstance) {
		log.debug("deleting Yingting instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Yingting findById(java.lang.Long id) {
		log.debug("getting Yingting instance with id: " + id);
		try {
			Yingting instance = (Yingting) getHibernateTemplate().get(
					"com.dpxt.domin.Yingting", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Yingting instance) {
		log.debug("finding Yingting instance by example");
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
		log.debug("finding Yingting instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Yingting as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByYtname(Object ytname) {
		return findByProperty(YTNAME, ytname);
	}

	public List findByHang(Object hang) {
		return findByProperty(HANG, hang);
	}

	public List findByLie(Object lie) {
		return findByProperty(LIE, lie);
	}

	public List findAll() {
		log.debug("finding all Yingting instances");
		try {
			String queryString = "from Yingting";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Yingting merge(Yingting detachedInstance) {
		log.debug("merging Yingting instance");
		try {
			Yingting result = (Yingting) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Yingting instance) {
		log.debug("attaching dirty Yingting instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Yingting instance) {
		log.debug("attaching clean Yingting instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static YingtingDAO getFromApplicationContext(ApplicationContext ctx) {
		return (YingtingDAO) ctx.getBean("YingtingDAO");
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

//	@Override
//	public List findById(long obj) {
//		return this.findById(obj);
//	}

	@Override
	public void save(Object obj) {
		// TODO Auto-generated method stub
		this.save(obj);
	}
}
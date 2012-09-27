package com.dpxt.dao.hbn;

import java.util.Date;
import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.dpxt.domin.Fangying;

/**
 * Data access object (DAO) for domain model class Fangying.
 * 
 * @see com.dpxt.domin.Fangying
 * @author MyEclipse Persistence Tools
 */

public class FangyingDAO extends BasicDao {
	private static final Log log = LogFactory.getLog(FangyingDAO.class);

	// property constants

	protected void initDao() {
		// do nothing
	}

	public void save(Fangying transientInstance) {
		log.debug("saving Fangying instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Fangying persistentInstance) {
		log.debug("deleting Fangying instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Fangying findById(java.lang.Long id) {
		log.debug("getting Fangying instance with id: " + id);
		try {
			Fangying instance = (Fangying) getHibernateTemplate().get(
					"com.dpxt.domin.Fangying", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Fangying instance) {
		log.debug("finding Fangying instance by example");
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
		log.debug("finding Fangying instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Fangying as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all Fangying instances");
		System.out.println("fang ying find alll...............");
		try {
			String queryString = "from Fangying";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Fangying merge(Fangying detachedInstance) {
		log.debug("merging Fangying instance");
		try {
			Fangying result = (Fangying) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Fangying instance) {
		log.debug("attaching dirty Fangying instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Fangying instance) {
		log.debug("attaching clean Fangying instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static FangyingDAO getFromApplicationContext(ApplicationContext ctx) {
		return (FangyingDAO) ctx.getBean("FangyingDAO");
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
package com.dpxt.dao.hbn;

import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.dpxt.domin.Piao;

/**
 * Data access object (DAO) for domain model class Piao.
 * 
 * @see com.dpxt.domin.Piao
 * @author MyEclipse Persistence Tools
 */

public class PiaoDAO extends BasicDao {
	private static final Log log = LogFactory.getLog(PiaoDAO.class);

	// property constants
	public static final String LEIXING = "leixing";

	public static final String PRICE = "price";

	protected void initDao() {
		// do nothing
	}

	public void save(Piao transientInstance) {
		log.debug("saving Piao instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Piao persistentInstance) {
		log.debug("deleting Piao instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Piao findById(java.lang.Long id) {
		log.debug("getting Piao instance with id: " + id);
		try {
			Piao instance = (Piao) getHibernateTemplate().get(
					"com.dpxt.domin.Piao", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Piao instance) {
		log.debug("finding Piao instance by example");
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
		log.debug("finding Piao instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Piao as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByLeixing(Object leixing) {
		return findByProperty(LEIXING, leixing);
	}

	public List findByPrice(Object price) {
		return findByProperty(PRICE, price);
	}

	public List findAll() {
		log.debug("finding all Piao instances");
		try {
			String queryString = "from Piao";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Piao merge(Piao detachedInstance) {
		log.debug("merging Piao instance");
		try {
			Piao result = (Piao) getHibernateTemplate().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Piao instance) {
		log.debug("attaching dirty Piao instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Piao instance) {
		log.debug("attaching clean Piao instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static PiaoDAO getFromApplicationContext(ApplicationContext ctx) {
		return (PiaoDAO) ctx.getBean("PiaoDAO");
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
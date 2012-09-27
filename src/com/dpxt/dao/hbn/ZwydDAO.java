package com.dpxt.dao.hbn;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.dpxt.domin.Zwyd;

/**
 * Data access object (DAO) for domain model class Zwyd.
 * 
 * @see com.dpxt.domin.Zwyd
 * @author MyEclipse Persistence Tools
 */

public class ZwydDAO extends BasicDao {
	private static final Log log = LogFactory.getLog(ZwydDAO.class);

	// property constants
	public static final String ZWZHT = "zwzht";

	public static final String HANG = "hang";

	public static final String LIE = "lie";

	public static final String ZT = "zt";

	protected void initDao() {
		// do nothing
	}

	public void save(Zwyd transientInstance) {
		log.debug("saving Zwyd instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Zwyd persistentInstance) {
		log.debug("deleting Zwyd instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Zwyd findById(java.lang.Long id) {
		log.debug("getting Zwyd instance with id: " + id);
		try {
			Zwyd instance = (Zwyd) getHibernateTemplate().get(
					"com.dpxt.domin.Zwyd", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Zwyd instance) {
		log.debug("finding Zwyd instance by example");
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
		log.debug("finding Zwyd instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Zwyd as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByZwzht(Object zwzht) {
		return findByProperty(ZWZHT, zwzht);
	}

	public List findByHang(Object hang) {
		return findByProperty(HANG, hang);
	}

	public List findByLie(Object lie) {
		return findByProperty(LIE, lie);
	}

	public List findByZt(Object zt) {
		return findByProperty(ZT, zt);
	}

	public List findAll() {
		log.debug("finding all Zwyd instances");
		try {
			String queryString = "from Zwyd";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Zwyd merge(Zwyd detachedInstance) {
		log.debug("merging Zwyd instance");
		try {
			Zwyd result = (Zwyd) getHibernateTemplate().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Zwyd instance) {
		log.debug("attaching dirty Zwyd instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Zwyd instance) {
		log.debug("attaching clean Zwyd instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ZwydDAO getFromApplicationContext(ApplicationContext ctx) {
		return (ZwydDAO) ctx.getBean("ZwydDAO");
	}

	@Override
	public void attachDirty(Object obj) {
		// TODO Auto-generated method stub
		this.attachDirty((Zwyd)obj);
	}

	@Override
	public void delete(Object obj) {
		// TODO Auto-generated method stub
		this.delete(obj);
	}

//	@Override
//	public List findById(long id) {
//		return this.findById(id);
//	}

	@Override
	public void save(Object obj) {
		// TODO Auto-generated method stub
		this.save(obj);
	}
}
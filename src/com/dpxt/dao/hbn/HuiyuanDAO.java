package com.dpxt.dao.hbn;

import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.dpxt.domin.Huiyuan;


/**
 * Data access object (DAO) for domain model class Huiyuan.
 * 
 * @see com.dpxt.domin.Huiyuan
 * @author MyEclipse Persistence Tools
 */

public class HuiyuanDAO extends BasicDao {
	private static final Log log = LogFactory.getLog(HuiyuanDAO.class);

	// property constants
	public static final String HYNAME = "hyname";

	public static final String JINE = "jine";

	public static final String PASSWORD = "password";

	protected void initDao() {
		// do nothing
	}

	public void save(Huiyuan transientInstance) {
		log.debug("saving Huiyuan instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Huiyuan persistentInstance) {
		log.debug("deleting Huiyuan instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Huiyuan findById(java.lang.Long id) {
		log.debug("getting Huiyuan instance with id: " + id);
		try {
			Huiyuan instance = (Huiyuan) getHibernateTemplate().get(
					"com.dpxt.domin.Huiyuan", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Huiyuan instance) {
		log.debug("finding Huiyuan instance by example");
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
		log.debug("finding Huiyuan instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Huiyuan as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByHyname(Object hyname) {
		return findByProperty(HYNAME, hyname);
	}

	public List findByJine(Object jine) {
		return findByProperty(JINE, jine);
	}

	public List findAll() {
		log.debug("finding all Huiyuan instances");
		try {
			String queryString = "from Huiyuan";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Huiyuan merge(Huiyuan detachedInstance) {
		log.debug("merging Huiyuan instance");
		try {
			Huiyuan result = (Huiyuan) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Huiyuan instance) {
		log.debug("attaching dirty Huiyuan instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Huiyuan instance) {
		log.debug("attaching clean Huiyuan instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static HuiyuanDAO getFromApplicationContext(ApplicationContext ctx) {
		return (HuiyuanDAO) ctx.getBean("HuiyuanDAO");
	}
	
	@Override
	public void attachDirty(Object obj) {
		// TODO Auto-generated method stub
		this.attachDirty((Huiyuan)obj);
	}

	@Override
	public void delete(Object obj) {
		// TODO Auto-generated method stub
		this.delete(obj);
	}

//	@Override
//	public Object findById(Long obj) {
//		return this.findById(obj);
//	}

	@Override
	public void save(Object obj) {
		// TODO Auto-generated method stub
		this.save(obj);
	}
}
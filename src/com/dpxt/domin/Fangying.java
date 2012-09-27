package com.dpxt.domin;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Fangying generated by MyEclipse Persistence Tools
 */

public class Fangying implements java.io.Serializable {

	// Fields

	private Long fyid;

	private Yingpian yingpian;

	private Yingting yingting;

	private Date fydate;

	private Date fytime;

	private Set zwyds = new HashSet(0);

	// Constructors

	/** default constructor */
	public Fangying() {
	}

	/** minimal constructor */
	public Fangying(Long fyid, Yingpian yingpian, Yingting yingting,
			Date fydate, Date fytime) {
		this.fyid = fyid;
		this.yingpian = yingpian;
		this.yingting = yingting;
		this.fydate = fydate;
		this.fytime = fytime;
	}

	/** full constructor */
	public Fangying(Long fyid, Yingpian yingpian, Yingting yingting,
			Date fydate, Date fytime, Set zwyds) {
		this.fyid = fyid;
		this.yingpian = yingpian;
		this.yingting = yingting;
		this.fydate = fydate;
		this.fytime = fytime;
		this.zwyds = zwyds;
	}

	// Property accessors

	public Long getFyid() {
		return this.fyid;
	}

	public void setFyid(Long fyid) {
		this.fyid = fyid;
	}

	public Yingpian getYingpian() {
		return this.yingpian;
	}

	public void setYingpian(Yingpian yingpian) {
		this.yingpian = yingpian;
	}

	public Yingting getYingting() {
		return this.yingting;
	}

	public void setYingting(Yingting yingting) {
		this.yingting = yingting;
	}

	public Date getFydate() {
		return this.fydate;
	}

	public void setFydate(Date fydate) {
		this.fydate = fydate;
	}

	public Date getFytime() {
		return this.fytime;
	}

	public void setFytime(Date fytime) {
		this.fytime = fytime;
	}

	public Set getZwyds() {
		return this.zwyds;
	}

	public void setZwyds(Set zwyds) {
		this.zwyds = zwyds;
	}

}
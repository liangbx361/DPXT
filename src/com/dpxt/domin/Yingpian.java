package com.dpxt.domin;

import java.util.HashSet;
import java.util.Set;

/**
 * Yingpian generated by MyEclipse Persistence Tools
 */

public class Yingpian implements java.io.Serializable {

	// Fields

	private Long ypid;

	private String ypname;

	private Set fangyings = new HashSet(0);

	// Constructors

	/** default constructor */
	public Yingpian() {
	}

	/** minimal constructor */
	public Yingpian(Long ypid) {
		this.ypid = ypid;
	}

	/** full constructor */
	public Yingpian(Long ypid, String ypname, Set fangyings) {
		this.ypid = ypid;
		this.ypname = ypname;
		this.fangyings = fangyings;
	}

	// Property accessors

	public Long getYpid() {
		return this.ypid;
	}

	public void setYpid(Long ypid) {
		this.ypid = ypid;
	}

	public String getYpname() {
		return this.ypname;
	}

	public void setYpname(String ypname) {
		this.ypname = ypname;
	}

	public Set getFangyings() {
		return this.fangyings;
	}

	public void setFangyings(Set fangyings) {
		this.fangyings = fangyings;
	}

}
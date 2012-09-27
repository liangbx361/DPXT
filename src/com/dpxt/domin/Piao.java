package com.dpxt.domin;

import java.util.HashSet;
import java.util.Set;

/**
 * Piao generated by MyEclipse Persistence Tools
 */

public class Piao implements java.io.Serializable {

	// Fields

	private Long pid;

	private String leixing;

	private String price;

	private Set zwyds = new HashSet(0);

	// Constructors

	/** default constructor */
	public Piao() {
	}

	/** minimal constructor */
	public Piao(Long pid) {
		this.pid = pid;
	}

	/** full constructor */
	public Piao(Long pid, String leixing, String price, Set zwyds) {
		this.pid = pid;
		this.leixing = leixing;
		this.price = price;
		this.zwyds = zwyds;
	}

	// Property accessors

	public Long getPid() {
		return this.pid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public String getLeixing() {
		return this.leixing;
	}

	public void setLeixing(String leixing) {
		this.leixing = leixing;
	}

	public String getPrice() {
		return this.price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public Set getZwyds() {
		return this.zwyds;
	}

	public void setZwyds(Set zwyds) {
		this.zwyds = zwyds;
	}

}
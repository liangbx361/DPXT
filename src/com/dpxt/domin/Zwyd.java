package com.dpxt.domin;

/**
 * Zwyd generated by MyEclipse Persistence Tools
 */

public class Zwyd implements java.io.Serializable {

	// Fields

	private Long zwydid;

	private Huiyuan huiyuan;

	private Fangying fangying;

	private Piao piao;

	private String zwzht;

	private Long hang;

	private Long lie;

	private Long zt;

	// Constructors

	/** default constructor */
	public Zwyd() {
	}

	/** minimal constructor */
	public Zwyd(Long zwydid, Fangying fangying) {
		this.zwydid = zwydid;
		this.fangying = fangying;
	}

	/** full constructor */
	public Zwyd(Long zwydid, Huiyuan huiyuan, Fangying fangying, Piao piao,
			String zwzht, Long hang, Long lie, Long zt) {
		this.zwydid = zwydid;
		this.huiyuan = huiyuan;
		this.fangying = fangying;
		this.piao = piao;
		this.zwzht = zwzht;
		this.hang = hang;
		this.lie = lie;
		this.zt = zt;
	}

	// Property accessors

	public Long getZwydid() {
		return this.zwydid;
	}

	public void setZwydid(Long zwydid) {
		this.zwydid = zwydid;
	}

	public Huiyuan getHuiyuan() {
		return this.huiyuan;
	}

	public void setHuiyuan(Huiyuan huiyuan) {
		this.huiyuan = huiyuan;
	}

	public Fangying getFangying() {
		return this.fangying;
	}

	public void setFangying(Fangying fangying) {
		this.fangying = fangying;
	}

	public Piao getPiao() {
		return this.piao;
	}

	public void setPiao(Piao piao) {
		this.piao = piao;
	}

	public String getZwzht() {
		return this.zwzht;
	}

	public void setZwzht(String zwzht) {
		this.zwzht = zwzht;
	}

	public Long getHang() {
		return this.hang;
	}

	public void setHang(Long hang) {
		this.hang = hang;
	}

	public Long getLie() {
		return this.lie;
	}

	public void setLie(Long lie) {
		this.lie = lie;
	}

	public Long getZt() {
		return this.zt;
	}

	public void setZt(Long zt) {
		this.zt = zt;
	}

}
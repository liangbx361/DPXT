/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.dpxt.struts.form;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

import com.dpxt.domin.FYDomin;
import com.dpxt.domin.Fangying;
import com.dpxt.domin.KongZhi;
import com.dpxt.domin.ZWDomin;

/** 
 * MyEclipse Struts
 * Creation date: 12-20-2008
 * 
 * XDoclet definition:
 * @struts.form name="dpForm"
 */
public class DPForm extends ActionForm {
	

	
	@Override
	public void reset(ActionMapping arg0, HttpServletRequest arg1) {
		// TODO Auto-generated method stub
		super.reset(arg0, arg1);
	}

	@Override
	public ActionErrors validate(ActionMapping arg0, HttpServletRequest arg1) {
		// TODO Auto-generated method stub
		return super.validate(arg0, arg1);
	}

	String num = "";
	ArrayList<Fangying> cond=new ArrayList<Fangying>();	
	ArrayList<FYDomin> fy=new ArrayList<FYDomin>();
	ArrayList<ZWDomin> zw=new ArrayList<ZWDomin>();
	ArrayList<KongZhi> kz=new ArrayList<KongZhi>();
	

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public ArrayList<Fangying> getCond() {
		return cond;
	}

	public void setCond(ArrayList<Fangying> cond) {
		this.cond = cond;
	}

	public ArrayList<FYDomin> getFy() {
		return fy;
	}

	public void setFy(ArrayList<FYDomin> fy) {
		this.fy = fy;
	}

	public ArrayList<ZWDomin> getZw() {
		return zw;
	}

	public void setZw(ArrayList<ZWDomin> zw) {
		this.zw = zw;
	}

	public ArrayList<KongZhi> getKz() {
		return kz;
	}

	public void setKz(ArrayList<KongZhi> kz) {
		this.kz = kz;
	}


	
}
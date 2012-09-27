/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.dpxt.struts.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.dpxt.domin.FYDomin;
import com.dpxt.domin.Fangying;
import com.dpxt.domin.ZWDomin;
import com.dpxt.domin.Zwyd;
import com.dpxt.service.FYShow;
import com.dpxt.service.FangYingService;
import com.dpxt.service.YingPianService;
import com.dpxt.service.YingTingService;
import com.dpxt.service.ZwydService;
import com.dpxt.struts.form.DPForm;

/** 
 * MyEclipse Struts
 * Creation date: 12-20-2008
 * 
 * XDoclet definition:
 * @struts.action path="/dP" name="dPForm" input="/form/dP.jsp" parameter="reqId" scope="request" validate="true"
 * @struts.action-forward name="OK" path="/index.jsp"
 */
public class DPAction extends DispatchAction {
	/*
	 * Generated Methods
	 */

	/** 
	 * Method execute
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */
	private YingPianService yps;
	private FangYingService fangYingService;
	private FYShow fys;
	private YingTingService yts;
	private ZwydService zwyds;
	
	public ZwydService getZwyds() {
		return zwyds;
	}

	public void setZwyds(ZwydService zwyds) {
		this.zwyds = zwyds;
	}

	public FangYingService getFangYingService() {
		return fangYingService;
	}

	public YingPianService getYps() {
		return yps;
	}
	public void setYps(YingPianService yps) {
		this.yps = yps;
	}
	public void setFangYingService(FangYingService fangYingService) {
		System.out.println("32312");
		this.fangYingService = fangYingService;
	}
	public FYShow getFys() {
		return fys;
	}

	public void setFys(FYShow fys) {
		this.fys = fys;
	}
	public YingTingService getYts() {
		return yts;
	}

	public void setYts(YingTingService yts) {
		this.yts = yts;
	}
	
	public ActionForward show(ActionMapping mapping, ActionForm form,
		HttpServletRequest request, HttpServletResponse response) {
		DPForm dpForm = new DPForm();// TODO Auto-generated method stub
		
		

		ArrayList<Fangying> lst1=new ArrayList<Fangying>();
		ArrayList<FYDomin> lst=new ArrayList<FYDomin>();
		lst1=(ArrayList<Fangying>) fangYingService.findAll();
// System.out.println(yps.findById((Long)lst1.get(0).getYingpian().getYpid()).getYpname());
//System.out.println(yps.findById(Long.parseLong("10001")));
		for(int i=0;i<lst1.size();i++){
			FYDomin fyd = new FYDomin();
			fyd.setYpid(lst1.get(i).getYingpian().getYpid()+"");
			fyd.setYtid(lst1.get(i).getYingting().getYtid()+"");
			fyd.setDate(lst1.get(i).getFydate()+"");
			fyd.setTime(lst1.get(i).getFytime()+"");
			fyd.setFyid(lst1.get(i).getFyid()+"");
			fyd.setYpName(yps.findById((Long)lst1.get(i).getYingpian().getYpid()).getYpname());
			fyd.setYtName(yts.findById((Long)lst1.get(i).getYingting().getYtid()).getYtname());
			lst.add(fyd);
		}		
		System.out.println(lst.get(0).getTime());
		System.out.println(lst.get(0).getFyid());
		System.out.println(lst);
	   	dpForm.setFy(lst); 	   
	   	request.setAttribute("dPForm", dpForm);
		return mapping.findForward("showOK");
	}

	public ActionForward xuanZuo(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		DPForm dpForm =(DPForm)form;
		ArrayList<ZWDomin> zw=new ArrayList<ZWDomin>();
		//int j = 2;
		String ytid = request.getParameter("ytid");
		String fyid = request.getParameter("fyid");
		ZWDomin zwd= new ZWDomin();
		Fangying fy=fangYingService.findById(Long.valueOf(fyid));
		
		List<Zwyd> lst= zwyds.findByProperty("fangying", fy);
		for(int i=0;i<lst.size();i++){
			if(i==0){
				zwd.setCount("0");
			}
			zwd.setHang(lst.get(i).getHang()+"");
			zwd.setLie(lst.get(i).getLie()+"");
			if(i>0){
				if(lst.get(i).getHang()!=lst.get(i-1).getHang()){
					zwd.setNum("1");
					zwd.setCount("0");
				}
			}			
			zw.add(zwd);
		}
		System.out.println(zw.size());
		dpForm.setZw(zw);
		
//request.setAttribute("dPForm", dpForm);
		return mapping.findForward("xuanzuoOK");
	}

	


}
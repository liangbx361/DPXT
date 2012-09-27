package com.dpxt.service;

import java.util.ArrayList;
import java.util.List;

import com.dpxt.domin.FYDomin;
import com.dpxt.domin.Fangying;


public class FYShowImpl implements FYShow {

	

	public ArrayList<FYDomin> show(FangYingService fys,YingPianService yps,YingTingService yts) {
		// TODO Auto-generated method stub
		
				
		
		ArrayList<Fangying> lst1=new ArrayList<Fangying>();
		ArrayList<FYDomin> lst=new ArrayList<FYDomin>();
//ArrayList<Yingpian> lst2=new ArrayList<Yingpian>();
//ArrayList<Yingting> lst3=new ArrayList<Yingting>();
		lst1=(ArrayList<Fangying>) fys.findAll();
		 
		for(int i=0;i<lst1.size();i++){
			FYDomin fyd = new FYDomin();
			fyd.setYpid(lst1.get(i).getYingpian().getYpid()+"");
			fyd.setYtid(lst1.get(i).getYingting().getYtid()+"");
			fyd.setDate(lst1.get(i).getFydate()+"");
			fyd.setTime(lst1.get(i).getFytime()+"");
			//fyd.setYpName(yps.findById(lst1.get(i).getYingpian().getYpid()).getYpname());
			//fyd.setYtName(yts.findById(lst1.get(i).getYingting().getYtid()).getYtname());
			lst.add(fyd);
		}		
		System.out.println(lst.size());
		return lst;
	}

}

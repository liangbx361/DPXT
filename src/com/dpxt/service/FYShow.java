package com.dpxt.service;

import java.util.ArrayList;
import java.util.List;

import com.dpxt.domin.FYDomin;

public interface FYShow {
	
	ArrayList<FYDomin> show(FangYingService fys,YingPianService yps ,YingTingService yts);
}

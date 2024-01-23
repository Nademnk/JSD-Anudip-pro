package com.BlueChem.sbtp.service;

import java.util.List;

import com.BlueChem.sbtp.entity.StoreMdcn;

public interface StoreMdcnService {

	    //fetch StoreMdcn list from db table 
		List<StoreMdcn>   fetchStoreMdcnDetails();
		
		//fetch StoreMdcn list from db table  as per city
		List<StoreMdcn>   fetchStoreMdcnDetails1(String city);
		
}

package com.BlueChem.sbtp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.BlueChem.sbtp.entity.StoreMdcn;
import com.BlueChem.sbtp.service.StoreMdcnService;

//Controller for all incoming request on StoreMdcn entity 
@RestController
public class StoreMdcnController {

	@Autowired
	StoreMdcnService sms;
	
	//get mapping to fetch all hotel 
	@GetMapping("/getStoreMdcn")
	public List<StoreMdcn> getStoreMdcn(){
		return sms.fetchStoreMdcnDetails();
	}
	
	//get mapping with parameter for Store Mdcn as per city
	@GetMapping("/getStoreMdcn/{city}")
	public List<StoreMdcn> getStoreMdcnByCity(@PathVariable("city") String city){
		return sms.fetchStoreMdcnDetails1(city);
	}
}

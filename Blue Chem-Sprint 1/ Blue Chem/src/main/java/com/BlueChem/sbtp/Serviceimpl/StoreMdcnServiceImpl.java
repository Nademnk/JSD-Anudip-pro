package com.BlueChem.sbtp.Serviceimpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.BlueChem.sbtp.repository.StoreMdcnRepository;
import com.BlueChem.sbtp.service.StoreMdcnService;
import com.BlueChem.sbtp.entity.StoreMdcn;

//business logic for entity hotelList 
@Service
public class StoreMdcnServiceImpl implements StoreMdcnService{

    @Autowired
	StoreMdcnRepository smrepo;

	//using findAll() method of JpaRepository to fetch all list of stores
	@Override
	public List<StoreMdcn> fetchStoreMdcnDetails() {
		return smrepo.findAll();
	}

	//using findByCity() of mdcnStore repository to fetch list as per city 
	@Override
	public List<StoreMdcn> fetchStoreMdcnDetails1(String city) {
		return smrepo.findBycity(city);
	}

	


	
}

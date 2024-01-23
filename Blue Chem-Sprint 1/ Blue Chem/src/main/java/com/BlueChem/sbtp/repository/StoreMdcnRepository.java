package com.BlueChem.sbtp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.BlueChem.sbtp.entity.StoreMdcn;

//Repository to get predefined method of JpaRepository for Entity HotelList 
public interface StoreMdcnRepository  extends JpaRepository<StoreMdcn, Integer>{
	
	//custom query using jpql
	//fetching medical shop list as per city
	@Query("Select hl from StoreMdcn hl where hl.city=?1")
	List<StoreMdcn>  findBycity(String city);
	

}

package com.BlueChem.sbtp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BlueChem.sbtp.entity.PaymentDetails;

public interface PaymentRepository  extends JpaRepository<PaymentDetails, Integer>{
	
}

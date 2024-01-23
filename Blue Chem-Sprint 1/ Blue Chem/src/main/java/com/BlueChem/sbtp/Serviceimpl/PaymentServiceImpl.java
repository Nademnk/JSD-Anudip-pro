package com.BlueChem.sbtp.Serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BlueChem.sbtp.entity.PaymentDetails;
import com.BlueChem.sbtp.repository.PaymentRepository;
import com.BlueChem.sbtp.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService{

	@Autowired
	PaymentRepository mdcnprepo;
	
	
	@Override
	public PaymentDetails addPayment(PaymentDetails paymentdetails) {
		
		return mdcnprepo.save(paymentdetails);
	}

	
	
	
}

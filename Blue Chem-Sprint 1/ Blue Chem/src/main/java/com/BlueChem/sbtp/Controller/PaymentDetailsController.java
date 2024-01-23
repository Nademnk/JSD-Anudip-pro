package com.BlueChem.sbtp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BlueChem.sbtp.entity.PaymentDetails;
import com.BlueChem.sbtp.service.PaymentService;

import jakarta.validation.Valid;

@RestController
public class PaymentDetailsController {

	@Autowired
	PaymentService pps;
	
	@PostMapping("/savePayment")
	public ResponseEntity<PaymentDetails> saveBookings(@Valid @RequestBody PaymentDetails paymentDetails){
		return new ResponseEntity<PaymentDetails>(pps.addPayment(paymentDetails),HttpStatus.CREATED);
	}
	
	
	
	
	
}

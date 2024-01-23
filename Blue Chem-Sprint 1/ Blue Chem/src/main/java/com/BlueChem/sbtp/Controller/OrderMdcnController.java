package com.BlueChem.sbtp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BlueChem.sbtp.entity.OrderMdcn;
import com.BlueChem.sbtp.service.OrderMdcnService;

import jakarta.validation.Valid;

@RestController
public class OrderMdcnController {

	@Autowired
      OrderMdcnService oms;
	
	@PostMapping("/saveOrders")
	public ResponseEntity<OrderMdcn> saveOrderMdcn(@Valid @RequestBody OrderMdcn ordermdcn){
		return new ResponseEntity<OrderMdcn>(oms.registerOrderMdcn(ordermdcn),HttpStatus.CREATED);
	}
	
	@GetMapping("/getOrderMdcnDetails/{mdcnid}")
	public ResponseEntity<OrderMdcn> fetchOrderMdcn(@PathVariable("mdcnid") int mdcnid){
		return new ResponseEntity<OrderMdcn>(oms.fetchOrderMdcnDetail(mdcnid), HttpStatus.OK);	
	}
	
	@DeleteMapping("/deleteOrderMdcn/{mdcnid}")
	public ResponseEntity<String> deleteOrderMdcn(@PathVariable("mdcnid") int mdcnid){
		oms.removeOrderMdcn(mdcnid);
		return new ResponseEntity<String>("<h1>Deleted OrderMdcn Record, Kindly contact customer care for refund policy based on MdcnOrder </h1>", HttpStatus.OK);
	}
	
	
	
	
	
	
	
	
	
}

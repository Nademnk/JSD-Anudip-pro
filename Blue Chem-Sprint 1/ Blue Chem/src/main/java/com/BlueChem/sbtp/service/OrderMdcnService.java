package com.BlueChem.sbtp.service;

import com.BlueChem.sbtp.entity.OrderMdcn;

public  interface OrderMdcnService {

	//register an new Bookings in db table
	OrderMdcn registerOrderMdcn(OrderMdcn ordermdcn);
		
		//remove existing Bookings record based on id from db table
		void removeOrderMdcn(int mdcnid);
		
		//fetch Bookings details based on from db table
		OrderMdcn fetchOrderMdcnDetail(int mdcnid);
}

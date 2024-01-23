package com.BlueChem.sbtp.Serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BlueChem.sbtp.entity.OrderMdcn;
import com.BlueChem.sbtp.exception.OrderMdcnIdNotFoundException;
import com.BlueChem.sbtp.repository.OrderMdcnRespository;
import com.BlueChem.sbtp.service.OrderMdcnService;

@Service
public class OrderMdcnServiceImpl  implements OrderMdcnService {

	
	    @Autowired
		OrderMdcnRespository mdcnrepo;
		
		@Override
		public OrderMdcn registerOrderMdcn(OrderMdcn ordermdcn) {
			return mdcnrepo.save(ordermdcn);
		}

		@Override
		public void removeOrderMdcn(int mdcnid) {
			mdcnrepo.findById(mdcnid).orElseThrow(() -> new OrderMdcnIdNotFoundException("Enter id is incorrect, please check"));
	       mdcnrepo.deleteById(mdcnid);
			
		}

		@Override
		public OrderMdcn fetchOrderMdcnDetail(int mdcnid) {
			return mdcnrepo.findById(mdcnid).orElseThrow(() -> new OrderMdcnIdNotFoundException("Enter id is incorrect, please check"));
			
		}
}

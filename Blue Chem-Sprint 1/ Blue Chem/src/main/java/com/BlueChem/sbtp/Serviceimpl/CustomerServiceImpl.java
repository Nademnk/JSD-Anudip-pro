package com.BlueChem.sbtp.Serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.BlueChem.sbtp.entity.Customer;
import com.BlueChem.sbtp.exception.CustomerIDNotFoundException;
import com.BlueChem.sbtp.repository.CustomerRepository;
import com.BlueChem.sbtp.service.CustomerService;

public class CustomerServiceImpl  implements CustomerService{

	//using spring dependency injection which marks constructor, getter-setter
		@Autowired
		CustomerRepository custRepo;

		//Registering customer into db table using save of jpaRepository
		@Override
		public Customer registerCustomer(Customer customer) {	
			return custRepo.save(customer);
		}
	//editing customer details using findById() & save() of JpaRepository 
		@Override
		public Customer editCustomer(Customer customer, int cId) {
			//fetch customer data based on id, if not found throw exception 
		Customer updatedCustomerdetails = custRepo.findById(cId).orElseThrow(() -> new CustomerIDNotFoundException("Entered Customer id is not proper / Invalid"));
		
		//set new values to customer entity
		updatedCustomerdetails.setCMobile(customer.getCMobile());
		updatedCustomerdetails.setAddr(customer.getAddr());
		
		custRepo.save(updatedCustomerdetails); //saving updated info in Customer Entity
		return updatedCustomerdetails;
		}

		//removing an customer record from db table using deleteById() of JpaRepository
		@Override
		public void removeCustomer(int cId) {
			//fetch customer data based on id, if not found throw exception 
			custRepo.findById(cId).orElseThrow(() -> new CustomerIDNotFoundException("Entered Customer id is not proper / Invalid"));
			
			//if id found then delete data of customer 
			custRepo.deleteById(cId);
			
		}
	//fetch an customer record from db table using findById() of JpaRepository
		@Override
		public Customer fetchCustomerDetail(int cId) {
			//fetch customer data based on id, if not found throw exception 
		return custRepo.findById(cId).orElseThrow(() -> new CustomerIDNotFoundException("Entered Customer id is not proper / Invalid"));
		}
		
}

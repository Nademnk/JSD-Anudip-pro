package com.BlueChem.sbtp.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class OrderMdcn {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mdcnid;
	
	@Column(length = 25, nullable = false, unique = true)
	@NotBlank(message="Name is mandotory to provide")
	private String mdcnName;
	
	@NotBlank(message="Type is mandotory to mention")
	@Column(length=15, nullable = false)
	private String type;
		
	private String mdcnType;
	
	@NotBlank(message="medicines company  is mandatory to provide")
	@Column(length=15, nullable = false)
	private String cmpnyOfmdcn;
	
	@NotNull(message="costOf medicine is mandatory to enter")
	@Column(length=15, nullable = false)
	private int mdcnCost;
	
	
	@NotBlank(message="Dose is mandatory")
	@Column(length=50, nullable = false)
	private String  mdcnDose ;
	
	@ManyToOne()
	@JoinColumn(name="customerId", referencedColumnName = "cId")
	@JsonBackReference
	Customer customer;
	
}

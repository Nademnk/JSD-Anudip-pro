package com.BlueChem.sbtp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;



@Entity
@Getter
@Setter
public class StoreMdcn {
	
	@Id
	private int Sid;
	
	@Column(name="smType", length=20, nullable = false)
	private String smType;
	
	
	@Column(name="mdcnName", length=30, nullable = false, unique = true)
	private String smName;
	
	@Column(name="contactNo", nullable = false, unique = true)
	private long contactNo;
	
	@Column(name="city", length=30, nullable = false)
	private String city ;
	
	@Column(name="addr", length=40, nullable = false)
	private String addr;
	
	@Column(name="avaliability", length=5, nullable = false)
	private String avaliability;
	
	
}










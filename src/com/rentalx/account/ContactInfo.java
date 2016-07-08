package com.rentalx.account;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity	
@Data
public class ContactInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String street;
	private String streetNumber;
	private String complement;
	private String city;
	private String county;
	private String country;
	private String phone;
	private String mobilePhone;
}

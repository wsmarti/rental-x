package com.rentalx.rental;


import javax.persistence.OneToOne;

import com.rentalx.account.Customer;
import com.rentalx.vehicle.Car;

import lombok.Data;

@Data
public class Rental {
	@OneToOne
	private Car car;
	@OneToOne
	private Customer customer;
	
}

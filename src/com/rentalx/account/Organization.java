package com.rentalx.account;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

import com.rentalx.rental.Booking;
import com.rentalx.vehicle.Car;

import lombok.Data;

@Entity
@PrimaryKeyJoinColumn (name="id")
@Data
public class Organization extends Account {
	@OneToMany
	private List<Booking> bookingList;
	@OneToMany
	private List<Car> carList;
	@OneToMany
	private List<Supplier> supplierList; 
	
	public Organization (){
		bookingList = new ArrayList<>();
		carList = new ArrayList<>();
		supplierList = new ArrayList<>();
	}
	
}

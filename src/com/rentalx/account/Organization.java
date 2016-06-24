package com.rentalx.account;

import java.util.ArrayList;

import lombok.Data;

@Data
public class Organization  extends Account{
	
	private ArrayList<Supplier> suplierList;
	
	private ArrayList<Customer> customerList;
	
	
}

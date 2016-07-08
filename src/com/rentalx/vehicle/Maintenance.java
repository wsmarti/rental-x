package com.rentalx.vehicle;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.rentalx.account.Supplier;

import lombok.Data;

@Data
@Entity
public class Maintenance {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	@OneToOne
	private Supplier supplier;
	private Double price;
}

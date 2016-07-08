package com.rentalx.vehicle;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class CarDocument {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	private String licencePlate;
	private String model;
	private String brand;
	private Integer carYear;
	private Integer docYear;
	
	
}

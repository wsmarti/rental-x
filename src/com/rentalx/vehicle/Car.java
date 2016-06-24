package com.rentalx.vehicle;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
public class Car {
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Long id;
	private Float km;
	private String marca;
	private String classe;
	private String ano;
	
	
	
}

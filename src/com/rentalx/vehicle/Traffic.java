package com.rentalx.vehicle;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Traffic {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	private Date date;
	private int km;
}

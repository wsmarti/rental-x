package com.rentalx.identity;

import java.io.Serializable;

import javax.persistence.Embeddable;


import lombok.Data;

@Data
//@Embeddable
public class Login implements Serializable {
	private String username;
	private String password;
	
}

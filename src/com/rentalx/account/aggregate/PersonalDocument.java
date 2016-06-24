package com.rentalx.account.aggregate;

import java.util.Date;

import lombok.Data;

@Data
public class PersonalDocument {
	private int id;
	private String idDocument;
	private Date expireDate;
	
}

package com.rentalx.account;

import java.util.ArrayList;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import com.rentalx.account.aggregate.Contact;
import com.rentalx.account.aggregate.PersonalDocument;

import lombok.Data;

@Data
@Entity
@PrimaryKeyJoinColumn (name="id")
public class Customer {
	
	private String name;
	@OneToOne
	@Embedded
	private PersonalDocument personalDocumentList;
	private Contact contact;
	

	
}

package com.rentalx.account;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

import lombok.Data;

@Entity
@PrimaryKeyJoinColumn (name="id")
@Data
public class Customer extends Account{
	@OneToMany
	private List<PersonalDocument> personalDocumentList;
	
	public Customer (){
		personalDocumentList = new ArrayList<>();
	}
}

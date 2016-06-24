package com.rentalx.account;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

import com.rentalx.account.aggregate.Contact;
import com.rentalx.account.aggregate.PersonalDocument;

import lombok.Data;

@Data
@Entity
@PrimaryKeyJoinColumn (name="id")
public class Supplier  extends Account {
	
}

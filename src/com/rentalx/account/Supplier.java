package com.rentalx.account;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

import lombok.Data;

@Entity
@PrimaryKeyJoinColumn (name="id")
@Data
public class Supplier extends Account {
}

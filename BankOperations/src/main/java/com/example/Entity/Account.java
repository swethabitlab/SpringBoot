package com.example.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Account {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String accountholder;
private Double balance;
public Account() {
	super();
	// TODO Auto-generated constructor stub
}
public Account(String accountholder, Double amount) {
	super();
	this.accountholder = accountholder;
	this.balance = amount;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getAccountholder() {
	return accountholder;
}
public void setAccountholder(String accountholder) {
	this.accountholder = accountholder;
}
public Double getAmount() {
	return balance;
}
public void setAmount(Double balance) {
	this.balance = balance;
}

}

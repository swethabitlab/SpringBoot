package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Amazon {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;
   private String name;
   private String mobileno;
   private String email;
   private String password;
public Amazon() {
	super();
	// TODO Auto-generated constructor stub
}
public Amazon(String name, String mobileno, String email, String password) {
	super();
	this.name = name;
	this.mobileno = mobileno;
	this.email = email;
	this.password = password;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMobileno() {
	return mobileno;
}
public void setMobileno(String mobileno) {
	this.mobileno = mobileno;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
   
}

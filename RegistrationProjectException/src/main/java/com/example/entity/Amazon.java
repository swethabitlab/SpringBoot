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
   private Double price;
public Amazon() {
	super();
	// TODO Auto-generated constructor stub
}
public Amazon(String name, Double price) {
	super();
	this.name = name;
	this.price = price;
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
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}
   
}

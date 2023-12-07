package com.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

@Entity
public class Student {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
@NotNull(message = "please enter your name")
private String name;
@Pattern(regexp = "^[6-9]\\d{9}$",message = "Invalid phone number")
private String phoneno;
@Email(message = "please enter a valid email")
private String email;
@Min(5)
@Max(26)
private int age;

public Student() {
	super();
	// TODO Auto-generated constructor stub
}

public Student(@NotNull(message = "please enter your name") String name,
		@Pattern(regexp = "^[6-9]\\d{9}$", message = "Invalid phone number") String phoneno,
		@Email(message = "please enter a valid email") String email, @Min(5) @Max(26) int age) {
	super();
	this.name = name;
	this.phoneno = phoneno;
	this.email = email;
	this.age = age;
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

public String getPhoneno() {
	return phoneno;
}

public void setPhoneno(String phoneno) {
	this.phoneno = phoneno;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

}

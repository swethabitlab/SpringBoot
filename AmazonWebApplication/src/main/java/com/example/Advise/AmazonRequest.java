package com.example.Advise;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class AmazonRequest {
	@NotNull(message = "user should be enter their name")
	private String name;
	@Pattern(regexp = "^\\d{10}$",message = "Invalid mobile number")
	   private String mobileno;
	@Email(message = "Invalid email")
	   private String email;
	@Pattern(regexp = "[A-Z][a-z]",message = "invalid password")
	   private String password;
	public AmazonRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AmazonRequest(@NotNull(message = "user should be enter their name") String name,
			@Pattern(regexp = "^\\d{10}$", message = "Invalid mobile number") String mobileno,
			@Email(message = "Invalid email") String email,
			@Pattern(regexp = "[A-Z][a-z]", message = "invalid password") String password) {
		super();
		this.name = name;
		this.mobileno = mobileno;
		this.email = email;
		this.password = password;
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

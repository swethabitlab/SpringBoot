package com.example.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Account;
import com.example.service.AccountService;

@RestController
public class AccountController {
@Autowired
private AccountService acs;
@PostMapping("/ac")
public ResponseEntity<Account> create( @RequestBody Account account) {
	try {
		return new ResponseEntity<Account>(acs.createAccount(account),HttpStatus.CREATED);
	}
	catch (Exception e) {
		return new ResponseEntity<Account>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
@GetMapping("/all")
public ResponseEntity<List<Account>> retrieve(){
	return new ResponseEntity<List<Account>>(acs.getAll(),HttpStatus.OK);
}

@GetMapping("{id}")
public ResponseEntity<Optional<Account>> getaccount(@PathVariable Long id){
	Optional<Account> a=acs.getAccount(id);
	if(a.isPresent()) {
		return new ResponseEntity<Optional<Account>>(a,HttpStatus.OK);
	}
	return new ResponseEntity<Optional<Account>>(HttpStatus.NOT_FOUND);
}
@GetMapping("/{id}/dep")
    public ResponseEntity<Account> depositmoney(@PathVariable Long id,@RequestBody Map<String,Double> request) {
    	Double amount=request.get("amount");
    	return new ResponseEntity<Account>(acs.deposit(id, amount),HttpStatus.OK);
}
@GetMapping("/{id}/wd")
    public  ResponseEntity<Account> withdrawmoney(@PathVariable Long id,@RequestBody Map<String,Double> request) {
    	Double amount=request.get("amount");
    	return new ResponseEntity<Account>(acs.withdraw(id, amount),HttpStatus.OK);
    }
    
}

package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Advise.AmazonRequest;
import com.example.entity.Amazon;
import com.example.service.AmazonService;
import com.example.service.UserNotFoundException;

import jakarta.validation.Valid;

@RestController
public class AmazonController {
	@Autowired
	private AmazonService amse;
	
	@PostMapping("/ama")
	public ResponseEntity<String> saveRecord(@RequestBody @Valid AmazonRequest amreq){
		try {
		return new ResponseEntity<String>(amse.registerUser(amreq),HttpStatus.CREATED);
		}catch (Exception e) {
			return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
   @GetMapping("/whole")
   public ResponseEntity<List<Amazon>> get(){
	   return new ResponseEntity<List<Amazon>>(amse.getall(),HttpStatus.OK);
   }
   @GetMapping("{id}")
   public ResponseEntity<Amazon> getid(@PathVariable int id) throws UserNotFoundException{
	   return new ResponseEntity<Amazon>(amse.getId(id),HttpStatus.OK);
	   
   }
   @DeleteMapping("{id}")
   public ResponseEntity<String> delete(@PathVariable int id) throws UserNotFoundException{
	   return new ResponseEntity<String>(amse.deleteid(id),HttpStatus.OK);
   }
   @PutMapping("/put")
   public ResponseEntity<String> updateRecord(@RequestBody @Valid AmazonRequest amreq){
		try {
		return new ResponseEntity<String>(amse.registerUser(amreq),HttpStatus.CREATED);
		}catch (Exception e) {
			return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}

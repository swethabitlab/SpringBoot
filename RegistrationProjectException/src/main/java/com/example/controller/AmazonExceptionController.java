package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Amazon;
import com.example.service.AmazonService;
import com.example.service.UserNotFoundException;

@RestController
public class AmazonExceptionController {
  @Autowired
  private AmazonService ams;
  @PostMapping("/re")
  public ResponseEntity<Amazon> registerAmazon(@RequestBody Amazon amazon){
	  try {
	  return new ResponseEntity<Amazon>(ams.register(amazon), HttpStatus.CREATED);
	  }
	  catch (Exception e) {
		  return new ResponseEntity<Amazon>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
  }
  @GetMapping("/{id}")
  public ResponseEntity<Amazon> get(@PathVariable int id) throws UserNotFoundException{
	  
	  return new ResponseEntity<Amazon>(ams.getId(id),HttpStatus.OK);
	 
  }
}

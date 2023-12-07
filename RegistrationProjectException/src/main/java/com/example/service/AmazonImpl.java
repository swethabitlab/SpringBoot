package com.example.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Amazon;
import com.example.repositary.AmazonRepositary;
@Service
public class AmazonImpl implements AmazonService{
@Autowired
private AmazonRepositary amrep;
	@Override
	public Amazon register(Amazon amazon) {
		
		return amrep.save(amazon);
	}
	@Override
	public Amazon getId(int id) throws UserNotFoundException {
		Optional<Amazon> a=amrep.findById(id);
		if(a.isPresent()) {
			return a.get();
		}
		else {
			throw new UserNotFoundException("id is not found");
		}
	}

}

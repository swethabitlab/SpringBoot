package com.example.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Advise.AmazonRequest;
import com.example.entity.Amazon;
import com.example.repositary.AmazonRepositary;

@Service
public class AmazonImplement implements AmazonService{
  @Autowired
  private AmazonRepositary amrepo;
	@Override
	public String registerUser(AmazonRequest amrequest) {
		Amazon a=new Amazon();
		a.setName(amrequest.getName());
		a.setMobileno(amrequest.getMobileno());
		a.setEmail(amrequest.getEmail());
		a.setPassword(amrequest.getPassword());
	
	List<Amazon> am=getall().stream().filter(res->(res.getEmail().equalsIgnoreCase(amrequest.getEmail())))
			.collect(Collectors.toList());
	if(am.isEmpty()) {
		amrepo.save(a);
		return "successfully registered";
	}
	else {
		return "email is already exist";
		}
	}

	@Override
	public List<Amazon> getall() {
		return amrepo.findAll();
	}

	@Override
	public Amazon getId(int id) throws UserNotFoundException {
		Optional<Amazon> az=amrepo.findById(id);
		if(az.isPresent()) {
			return az.get();
		}
		else {
			throw new UserNotFoundException("id is not found");
		}
	}

	@Override
	public String deleteid(int id) throws UserNotFoundException {
		if(amrepo.existsById(id)) {
			amrepo.deleteById(id);
			return "successfully deleted";
		}
		else {
			throw new UserNotFoundException("id is not found");
		}
	}

}

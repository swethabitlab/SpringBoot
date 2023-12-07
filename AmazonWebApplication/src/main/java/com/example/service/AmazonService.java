package com.example.service;

import java.util.List;

import com.example.Advise.AmazonRequest;
import com.example.entity.Amazon;

public interface AmazonService {
  String registerUser(AmazonRequest amrequest);
  List<Amazon> getall();
  Amazon getId(int id) throws UserNotFoundException;
  String deleteid(int id) throws UserNotFoundException;
  
}

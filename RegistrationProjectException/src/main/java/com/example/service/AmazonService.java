package com.example.service;

import com.example.entity.Amazon;

public interface AmazonService {
  Amazon register(Amazon amazon);
  Amazon getId(int id) throws UserNotFoundException;
}

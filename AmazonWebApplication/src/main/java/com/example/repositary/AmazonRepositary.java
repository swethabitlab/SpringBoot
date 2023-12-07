package com.example.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Amazon;

public interface AmazonRepositary extends JpaRepository<Amazon, Integer>{

}

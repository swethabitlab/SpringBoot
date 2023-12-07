package com.example.dto;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.service.UserNotFoundException;

@RestControllerAdvice
public class ExceptionHandler {
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@org.springframework.web.bind.annotation.ExceptionHandler(UserNotFoundException.class)
	public Map<String, String> resourceNot(UserNotFoundException error){
		Map<String, String> m=new HashMap<>();
		m.put("errormessage",error.getMessage());
		return m;
	}
}

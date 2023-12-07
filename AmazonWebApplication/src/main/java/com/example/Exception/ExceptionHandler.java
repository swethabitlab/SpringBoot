package com.example.Exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.service.UserNotFoundException;

@RestControllerAdvice
public class ExceptionHandler {
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@org.springframework.web.bind.annotation.ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String, String> accessException(MethodArgumentNotValidException error){
		Map<String, String> m=new HashMap<>();
		error.getBindingResult().getFieldErrors().forEach(e->{
			m.put(e.getField(),e.getDefaultMessage());
		});
		return m;
		
	}
	
   @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@org.springframework.web.bind.annotation.ExceptionHandler(UserNotFoundException.class)
	public Map<String,String> usernotExist(UserNotFoundException usererr){
		Map<String,String> ma=new HashMap<>();
		ma.put("errormessage", usererr.getMessage());
		return ma;
	}
}

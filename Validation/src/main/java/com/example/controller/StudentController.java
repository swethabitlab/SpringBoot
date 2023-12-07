package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Student;
import com.example.service.StudentService;



@RestController
public class StudentController {
@Autowired
private StudentService stse;

@PostMapping("/set")
public Student create(@RequestBody Student student ) {
	return stse.addRecord(student);
}
}
package com.example.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Student;
import com.example.repositary.StudentRepositary;
import com.example.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService{
@Autowired
private StudentRepositary strep;
	@Override
	public Student addRecord(Student stu) {
		
		return strep.save(stu);
	}

}

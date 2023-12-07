package com.example.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Student;

public interface StudentRepositary extends JpaRepository<Student, Integer>{

}

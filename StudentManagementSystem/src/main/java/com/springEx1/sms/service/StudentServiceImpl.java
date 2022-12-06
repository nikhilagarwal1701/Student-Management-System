package com.springEx1.sms.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springEx1.sms.entity.Student;
import com.springEx1.sms.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
	
	private StudentRepository studentRepository;
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}
	
}

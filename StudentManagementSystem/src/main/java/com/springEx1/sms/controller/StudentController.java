package com.springEx1.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.springEx1.sms.service.StudentService;

@Controller
public class StudentController {
	private StudentService studentService;
	
	@GetMapping("/students")
	public String listStudent(Model model) {
		model.addAttribute("students", studentService.getAllStudents());
		return "students";
	}
}

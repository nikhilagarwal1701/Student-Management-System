package com.springEx1.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springEx1.sms.entity.Student;


//JpaRepository already has Repository annotation, so no need to add here
public interface StudentRepository extends JpaRepository<Student, Long>{
	
}

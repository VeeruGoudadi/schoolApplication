package com.schoolApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.schoolApplication.entity.Student;

import schoolApplication.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService service;
	
	@Autowired
	Student student;
	
	@PostMapping("/add")
	public String addStudent(@RequestBody Student student)
	{
	   String msg=service.insert(student);
		return msg;
	}
	
	@PutMapping("/put")
	public String updateStudent(@RequestBody Student student )
	{
		String msg=service.update(student);
		return msg;
	}
	
	@GetMapping("/get")
	public Student getDetails(@RequestParam int id)
	{
		Student student=service.getStudent(id);
		return student;
	}
	
	@DeleteMapping("/delete")
	public String deleteDetails(@RequestParam int id)
	{
		String msg=service.deleteDetails(id);
		return msg;
	}
	
 
}

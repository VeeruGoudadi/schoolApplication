package com.schoolApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.schoolApplication.entity.Teacher;




import schoolApplication.service.TeacherService;

@RestController
public class TeacherController {
	
	@Autowired
	Teacher teacher;
	
	@Autowired
	TeacherService service;

	@PostMapping("/addTeacher")
	public String addTeacher(@RequestBody Teacher teacher)
	{
	   String msg=service.insert(teacher);
		return msg;
	}
	
	@PutMapping("/putTeacher")
	public String updateStudent(@RequestBody Teacher teacher )
	{
		String msg=service.update(teacher);
		return msg;
	}
	
	@GetMapping("/getTeacher")
	public Teacher getDetails(@RequestParam int id)
	{
		Teacher teacher=service.getTeacher(id);
		return teacher;
	}
	
	@DeleteMapping("/deleteTeacher")
	public String deleteDetails(@RequestParam int id)
	{
		String msg=service.deleteDetails(id);
		return msg;
	}
}

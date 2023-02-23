package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Student;
import com.example.demo.Service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private  StudentService stuservice;
	
	@PostMapping("/store")
	public String saveDetails(@RequestBody Student s)
	{
		stuservice.saveDetails(s);
		return "success";
	} 
	
	@GetMapping("/getstudent")
	public List<Student> getAllDetails()
	{
		return stuservice.getAllDetails();
	}
	
	@GetMapping("/getdept")
	public void deleteDepartmentById(int id)
		{
			stuservice.deleteDepartmentById(id);
		}
}
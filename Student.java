package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="studentss")
public class Student {
	
	@Id
	@Column(name="id")	
	private int id;
	
	@Column(name="name")	
	private String name;
	
	@Column(name="dept")
	private String dept;
	
	
	public Student(int id, String name,  String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	
	public Student() {
		
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDept() {
		return dept;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	
}
package com.example.demo.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Department {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String location;
	
	
	@OneToMany(mappedBy = "department")
	List<Employee> employee;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public List<Employee> getEmployee() {
		return employee;
	}


	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
	
	
}

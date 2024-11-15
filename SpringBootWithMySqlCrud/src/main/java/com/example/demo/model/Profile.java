package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Profile {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String shift;
	
	
	@OneToOne(mappedBy = "profile")
	Employee employee;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getShift() {
		return shift;
	}


	public void setShift(String shift) {
		this.shift = shift;
	}


	public Employee getEmployee() {
		return employee;
	}


	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	 
	
}

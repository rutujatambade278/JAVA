package com.example.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Employee{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String address;
	
	
	
	/*
	
	//Unidirectional
	
	//OneOtOne 
	@OneToOne(cascade = CascadeType.ALL ,orphanRemoval = true)
	@JoinColumn(name = "profile_id",referencedColumnName="id")
	private Profile profile; 
	
	
	
	//many to one
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "department_id",referencedColumnName="id")
	private Department department;
	
	
	
	//OneToMany
	@OneToMany(cascade = CascadeType.ALL ,orphanRemoval = true)
	@JoinColumn(name = "employee_id",referencedColumnName="id")
	private List<Task> task;
	
	
	//ManyToMany
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Project> project;
	
	
	*/
	
	
	// Bidirectional
	
	//One To One 
	
	@OneToOne(cascade = CascadeType.ALL,orphanRemoval = true)
	@JoinColumn(name = "profile_id",referencedColumnName = "id")
	private Profile profile;
	
	
	
	//Many To One
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="department_id",referencedColumnName = "id")
	private Department department;
	
	
	
	// one to many
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "employee")
	private List<Task> task;
	
	
	//many to many
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Project> project;


	  
	public Employee(Long id, String name, String address, Profile profile, Department department, List<Task> task,
			List<Project> project) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.profile = profile;
		this.department = department;
		this.task = task;
		this.project = project;
	}


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


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public Profile getProfile() {
		return profile;
	}


	public void setProfile(Profile profile) {
		this.profile = profile;
	}


	public Department getDepartment() {
		return department;
	}


	public void setDepartment(Department department) {
		this.department = department;
	}


	public List<Task> getTask() {
		return task;
	}


	public void setTask(List<Task> task) {
		this.task = task;
	}


	public List<Project> getProject() {
		return project;
	}


	public void setProject(List<Project> project) {
		this.project = project;
	}
	
	
}

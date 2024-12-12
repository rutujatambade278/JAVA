package com.jwt.entity;

import java.security.Permission;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

//Role.java
@Entity
 public class Role {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 private String roleName;

 @ManyToMany
 @JoinTable(
   name = "role_permission", 
   joinColumns = @JoinColumn(name = "role_id"), 
   inverseJoinColumns = @JoinColumn(name = "permission_id"))
    private Set<Permission> permissions;

 
 public Role(Long id, String roleName, Set<Permission> permissions) {
	super();
	this.id = id;
	this.roleName = roleName;
	this.permissions = permissions;
}


public Long getId() {
	return id;
}


public void setId(Long id) {
	this.id = id;
}


public String getRoleName() {
	return roleName;
}


public void setRoleName(String roleName) {
	this.roleName = roleName;
}


public Set<Permission> getPermissions() {
	return permissions;
}


public void setPermissions(Set<Permission> permissions) {
	this.permissions = permissions;
}


 
 
}

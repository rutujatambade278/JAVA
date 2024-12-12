package com.springproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springproject.service.RoleService;

@RestController
@RequestMapping("/roles")
public class RoleController {

    @Autowired
    private RoleService roleService;

    // Create Role
    @PostMapping
    public ResponseEntity<String> createRole(@RequestBody String roleName) {
        roleService.createRole(roleName);
        return new ResponseEntity<>("Role created successfully", HttpStatus.CREATED);
    }

    // Get Role ID by Name
    @GetMapping("/{roleName}")
    public ResponseEntity<Integer> getRoleIdByName(@PathVariable String roleName) {
        int roleId = roleService.getRoleIdByName(roleName);
        return new ResponseEntity<>(roleId, HttpStatus.OK);
    }
}
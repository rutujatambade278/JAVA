package com.springproject.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springproject.Dao.RoleRepository;
import com.springproject.entity.Role;
import com.springproject.Dao.RoleRepository;

@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    public void createRole(Role role) {
        roleRepository.insertRole(role);
    }

    public Role getRoleById(int roleId) {
        return roleRepository.getRoleById(roleId);
    }

    public List<Role> getAllRoles() {
        return roleRepository.getAllRoles();
    }

    public void updateRole(Role role) {
        roleRepository.updateRole(role);
    }

    public void deleteRole(int roleId) {
        roleRepository.removeRole(roleId);
    }

	public void createRole(String roleName) {
		// TODO Auto-generated method stub
		
	}

	public int getRoleIdByName(String roleName) {
		// TODO Auto-generated method stub
		return 0;
	}
}

package com.springproject.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springproject.Dao.RoleDao;

@Service
public class RoleService {

    @Autowired
    private RoleDao roleDao;

    // Create Role
    public void createRole(String roleName) {
        roleDao.insertRole(roleName);
    }

    // Get Role ID by Name
    public int getRoleIdByName(String roleName) {
        return roleDao.getRoleIdByName(roleName);
    }
}
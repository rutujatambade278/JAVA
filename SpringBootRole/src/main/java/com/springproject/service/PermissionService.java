package com.springproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springproject.Dao.PermissionRepository;
import com.springproject.entity.Permission;

@Service
public class PermissionService {

    @Autowired
    private PermissionRepository permissionRepository;

    public Permission createPermission(Permission permission) {
        permissionRepository.insertPermission(permission);
		return permission;
    }

    public Permission getPermissionById(int permissionId) {
        return permissionRepository.getPermissionById(permissionId);
    }

    public List<Permission> getAllPermissions() {
        return permissionRepository.getAllPermissions();
    }

    public void updatePermission(Permission permission) {
        permissionRepository.updatePermission(permission);
    }

    public void deletePermission(int permissionId) {
        permissionRepository.removePermission(permissionId);
    }
}

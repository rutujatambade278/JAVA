//package com.jwt.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.jwt.dao.PermissionDao;
//import com.jwt.dao.RoleDao;
//import com.jwt.entity.Permission;
//import com.jwt.entity.Role;
//
//import java.util.HashSet;
//import java.util.List;
//import java.util.Optional;
//import java.util.Set;
//
//@Service
//public class RolePermissionService {
//
//    @Autowired
//    private RoleDao roleDao;
//
//    @Autowired
//    private PermissionDao permissionDao;
//
//    // Add permission to an existing role
//    public Role addPermissionToRole(int roleId, int permissionId) {
//        Role role = roleDao.findById(roleId).orElseThrow(() -> new RuntimeException("Role not found"));
//        Permission permission = permissionDao.findById(permissionId).orElseThrow(() -> new RuntimeException("Permission not found"));
//
//        role.getPermissions().add(permission);
//        return roleDao.save(role);
//    }
//
//    // Remove a permission from a role
//    public Role removePermissionFromRole(int roleId, int permissionId) {
//        Role role = roleDao.findById(roleId).orElseThrow(() -> new RuntimeException("Role not found"));
//        Permission permission = permissionDao.findById(permissionId).orElseThrow(() -> new RuntimeException("Permission not found"));
//
//        role.getPermissions().remove(permission);
//        return roleDao.save(role);
//    }
//
//    // Create a new role with associated permissions
//    public Role createRoleWithPermissions(Role role, Set<Permission> permissions) {
//        role.setPermissions(permissions != null ? permissions : new HashSet<>());
//        return roleDao.save(role);
//    }
//
//    // Create a new permission
//    public Permission createPermission(Permission permission) {
//        Optional<Permission> existingPermission = permissionDao.findByPermissionName(permission.getPermissionName());
//        if (existingPermission.isPresent()) {
//            throw new RuntimeException("Permission already exists: " + permission.getPermissionName());
//        }
//        return permissionDao.save(permission);
//    }
//
//    // Retrieve all permissions
//    public Iterable<Permission> getAllPermissions() {
//        return permissionDao.findAll();
//    }
//
//    // Delete a permission by its ID
//    public void deletePermission(Long id) {
//        Role permission = permissionDao.findById(id).orElseThrow(() -> new RuntimeException("Permission not found"));
//        permissionDao.deleteById(permission);
//    }
//}

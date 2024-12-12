//package com.jwt.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.access.prepost.PreAuthorize;
//import org.springframework.web.bind.annotation.*;
//
//import com.jwt.entity.Permission;
//import com.jwt.entity.Role;
//
//
//import java.util.List;
//import java.util.Set;
//
//@RestController
//@RequestMapping("/api/permissions")
//public class PermissionController {
//
//    @Autowired
//    private RolePermissionService permissionService;
//
//    @PostMapping
//    @PreAuthorize("hasRole('Admin')")
//    public Permission createPermission(@RequestBody Permission permission) {
//        return permissionService.createPermission(permission);
//    }
//
//    // Only Admin can view all permissions
//    @GetMapping
//    @PreAuthorize("hasRole('Admin')")
//    public Iterable<Permission> getAllPermissions() {
//        return permissionService.getAllPermissions();
//    }
//
//    // Only Admin can delete permissions
//    @DeleteMapping("/{id}")
//    @PreAuthorize("hasRole('Admin')")
//    public void deletePermission(@PathVariable Long id) {
//        permissionService.deletePermission(id);
//    }
//}

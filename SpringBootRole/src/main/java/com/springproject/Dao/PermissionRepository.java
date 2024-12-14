package com.springproject.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springproject.entity.Permission;
import org.springframework.jdbc.core.JdbcTemplate;

@Repository
public class PermissionRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insertPermission(Permission permission) {
        String query = "INSERT INTO permission (permission_name) VALUES (?)";
        jdbcTemplate.update(query, permission.getPermissionName());
    }

    public Permission getPermissionById(int permissionId) {
        String query = "SELECT * FROM permission WHERE permission_id = ?";
        return jdbcTemplate.queryForObject(query, (rs, rowNum) -> new Permission(
        ), permissionId);
    }

    public List<Permission> getAllPermissions() {
        String query = "SELECT * FROM permission";
        return jdbcTemplate.query(query, (rs, rowNum) -> new Permission(
        ));
    }

    public void updatePermission(Permission permission) {
        String query = "UPDATE permission SET permission_name = ? WHERE permission_id = ?";
        jdbcTemplate.update(query, permission.getPermissionName(), permission.getPermissionId());
    }

    public void removePermission(int permissionId) {
        String query = "DELETE FROM permission WHERE permission_id = ?";
        jdbcTemplate.update(query, permissionId);
    }
}

package com.springproject.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springproject.entity.Role;

@Repository
public class RoleRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insertRole(Role role) {
        String query = "INSERT INTO role (role_name) VALUES (?)";
        jdbcTemplate.update(query, role.getName());
    }

    public Role getRoleById(int roleId) {
        String query = "SELECT * FROM role WHERE role_id = ?";
        return jdbcTemplate.queryForObject(query, (rs, rowNum) -> new Role(
                rs.getInt("role_id"),
                rs.getString("role_name")
        ), roleId);
    }

    public List<Role> getAllRoles() {
        String query = "SELECT * FROM role";
        return jdbcTemplate.query(query, (rs, rowNum) -> new Role(
                rs.getInt("role_id"),
                rs.getString("role_name")
        ));
    }

    public void updateRole(Role role) {
        String query = "UPDATE role SET role_name = ? WHERE role_id = ?";
        jdbcTemplate.update(query, role.getName(), role.getId());
    }

    public void removeRole(int roleId) {
        String query = "DELETE FROM role WHERE role_id = ?";
        jdbcTemplate.update(query, roleId);
    }
}

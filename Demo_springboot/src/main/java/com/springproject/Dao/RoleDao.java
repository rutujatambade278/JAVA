package com.springproject.Dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class RoleDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    // Create Role
    public void insertRole(String roleName) {
        String query = "INSERT INTO role (role_name) VALUES (?)";
        jdbcTemplate.update(query, roleName);
    }

    // Get Role ID by Name
    public int getRoleIdByName(String roleName) {
        String query = "SELECT role_id FROM role WHERE role_name = ?";
        return jdbcTemplate.queryForObject(query, new Object[]{roleName}, Integer.class);
    }
}
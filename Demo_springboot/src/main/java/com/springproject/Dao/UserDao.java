package com.springproject.Dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springproject.entity.User;

import java.util.List;

@Repository
public class UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    // Create User
    public void insertUser(User user) {
        String query = "INSERT INTO user (username, password) VALUES (?, ?)";
        jdbcTemplate.update(query, user.getUsername(), user.getPassword());
    }

    // Read User by ID
    public User getUserById(int userId) {
        String query = "SELECT * FROM user WHERE user_id = ?";
        return jdbcTemplate.queryForObject(query, new Object[]{userId}, new UserRowMapper());
    }

    // Update User
    public void updateUser(User user) {
        String query = "UPDATE user SET username = ?, password = ? WHERE user_id = ?";
        jdbcTemplate.update(query, user.getUsername(), user.getPassword(), user.getUserId());
    }

    // Delete User
    public void deleteUser(int userId) {
        String query = "DELETE FROM user WHERE user_id = ?";
        jdbcTemplate.update(query, userId);
    }

    // Get All Users
    public List<User> getAllUsers() {
        String query = "SELECT * FROM user";
        return jdbcTemplate.query(query, new UserRowMapper());
    }
}

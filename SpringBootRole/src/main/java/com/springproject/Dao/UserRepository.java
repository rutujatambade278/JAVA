package com.springproject.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springproject.entity.User;

@Repository
public class UserRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insertUser(User user) {
        String query = "INSERT INTO user (username, password) VALUES (?, ?)";
        jdbcTemplate.update(query, user.getUsername(), user.getPassword());
    }

    public User getUserById(int userId) {
        String query = "SELECT * FROM user WHERE user_id = ?";
        return jdbcTemplate.queryForObject(query, (rs, rowNum) -> new User(
                rs.getInt("user_id"),
                rs.getString("username"),
                rs.getString("password")
        ), userId);
    }

    public List<User> getAllUsers() {
        String query = "SELECT * FROM user";
        return jdbcTemplate.query(query, (rs, rowNum) -> new User(
                rs.getInt("user_id"),
                rs.getString("username"),
                rs.getString("password")
        ));
    }

    public void updateUser(User user) {
        String query = "UPDATE user SET username = ?, password = ? WHERE user_id = ?";
        jdbcTemplate.update(query, user.getUsername(), user.getPassword(), user.getId());
    }

    public void removeUser(int userId) {
        String query = "DELETE FROM user WHERE user_id = ?";
        jdbcTemplate.update(query, userId);
    }
}

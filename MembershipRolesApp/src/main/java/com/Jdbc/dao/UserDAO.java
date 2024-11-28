package com.Jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.Jdbc.dao.model.User;
import com.Jdbc.util.DBConnection;

public class UserDAO {

    // Validate user credentials and retrieve role
    public User validateUser(String username, String password) {
        User user = null;
        try (Connection connection = DBConnection.getConnection()) {
            String query = "SELECT u.id, u.username, u.role_id, r.name as role_name " +
                           "FROM users u " +
                           "INNER JOIN roles r ON u.role_id = r.id " +
                           "WHERE u.username = ? AND u.password = ?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                user = new User();
                user.setId(rs.getInt("id"));
                user.setUsername(rs.getString("username"));
                user.setRole(rs.getString("role_name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }

    // Fetch user by ID
    public User getUserById(int id) {
        User user = null;
        try (Connection connection = DBConnection.getConnection()) {
            String query = "SELECT u.id, u.username, u.role_id, r.name as role_name " +
                           "FROM users u " +
                           "INNER JOIN roles r ON u.role_id = r.id " +
                           "WHERE u.id = ?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                user = new User();
                user.setId(rs.getInt("id"));
                user.setUsername(rs.getString("username"));
                user.setRole(rs.getString("role_name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }
}

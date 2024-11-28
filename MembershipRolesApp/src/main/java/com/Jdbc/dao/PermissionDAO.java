package com.Jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.Jdbc.dao.model.Permission;
import com.Jdbc.util.DBConnection;

public class PermissionDAO {
    public List<Permission> getPermissionsByRole(int roleId) {
        List<Permission> permissions = new ArrayList<>();
        try (Connection connection = DBConnection.getConnection()) {
            String query = "SELECT p.id, p.name FROM permissions p " +
                           "INNER JOIN role_permissions rp ON p.id = rp.permission_id " +
                           "WHERE rp.role_id = ?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, roleId);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Permission permission = new Permission();
                permission.setId(rs.getInt("id"));
                permission.setName(rs.getString("name"));
                permissions.add(permission);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return permissions;
    }
}
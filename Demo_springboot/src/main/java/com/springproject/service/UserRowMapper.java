package com.springproject.service;


import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

import com.springproject.entity.User;

public class UserRowMapper implements RowMapper {

    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        User user = new User();
        user.setId(rs.getInt("user_id"));
        user.setUsername(rs.getString("username"));
        user.setPassword(rs.getString("password"));
        return user;
    }

	@Override
	public int[] getRowsForPaths(TreePath[] path) {
		// TODO Auto-generated method stub
		return null;
	}
}
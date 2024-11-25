package com.jwt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.jwt.dao.RoleDao;
import com.jwt.dao.UserDao;
import com.jwt.entity.Role;
import com.jwt.entity.User;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private RoleDao roleDao;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostConstruct
    public void initRoleAndUser() {
        if (!roleDao.existsById("Admin")) {
            Role adminRole = new Role();
            adminRole.setRoleName("Admin");
            adminRole.setRoleDescription("Admin role");
            roleDao.save(adminRole);
        }

        if (!roleDao.existsById("User")) {
            Role userRole = new Role();
            userRole.setRoleName("User");
            userRole.setRoleDescription("Default role for newly created record");
            roleDao.save(userRole);
        }

        if (!userDao.existsById("admin123")) {
            User adminUser = new User();
            adminUser.setUserName("admin123");
            adminUser.setUserPassword(getEncodedPassword("admin@pass"));
            adminUser.setUserFirstName("admin");
            adminUser.setUserLastName("admin");
            Set<Role> adminRoles = new HashSet<>();
            adminRoles.add(roleDao.findById("Admin").orElseThrow(() -> new RuntimeException("Admin role not found")));
            adminUser.setRole(adminRoles);
            userDao.save(adminUser);
        }
    }

    public String getEncodedPassword(String password) {
        return passwordEncoder.encode(password);
    }

    public User registerNewUser(User user) {
        if (userDao.existsById(user.getUserName())) {
            throw new RuntimeException("User already exists with username: " + user.getUserName());
        }
        Role userRole = roleDao.findById("User").orElseThrow(() -> new RuntimeException("Default role not found"));
        Set<Role> roles = new HashSet<>();
        roles.add(userRole);
        user.setRole(roles);
        user.setUserPassword(getEncodedPassword(user.getUserPassword()));
        return userDao.save(user);
    }
}
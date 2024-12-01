//package com.jwt.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//
//import com.jwt.dao.RoleDao;
//import com.jwt.dao.UserDao;
//import com.jwt.entity.Role;
//import com.jwt.entity.User;
//import com.jwt.service.UserService;
//
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//
//@Service
//public class UserServiceImpl implements UserService {
//
//    @Autowired
//    private UserDao userDao;
//
//    @Autowired
//    private RoleDao roleDao;
//
//    @Autowired
//    private PasswordEncoder passwordEncoder;
//
//    @Override
//    public User createUser(User user) {
//        // Custom logic to create a user
//        return userDao.save(user);
//    }
//
//    @Override
//    public List<User> getAllUsers() {
//        return (List<User>) userDao.findAll();
//    }
//
//    @Override
//    public User getUserById(Long id) {
//        return userDao.findById(id).orElseThrow(() -> new RuntimeException("User not found with ID: " + id));
//    }
//
//    @Override
//    public User updateUser(Long id, User user) {
//        User existingUser = userDao.findById(id).orElseThrow(() -> new RuntimeException("User not found with ID: " + id));
//        existingUser.setUserName(user.getUserName());
//        if (user.getUserPassword() != null && !user.getUserPassword().isEmpty()) {
//            existingUser.setUserPassword(passwordEncoder.encode(user.getUserPassword()));
//        }
//        existingUser.setRole(user.getRole());
//        return userDao.save(existingUser);
//    }
//
//    @Override
//    public void deleteUser(Long id) {
//        userDao.deleteById(id);
//    }
//
//    @Override
//    public User registerNewUser(User user) {
//        if (userDao.existsByUserName(user.getUserName())) {
//            throw new RuntimeException("User already exists with username: " + user.getUserName());
//        }
//        Role role = roleDao.findByRoleName("User");
//        Set<Role> roles = new HashSet<>();
//        roles.add(role);
//        user.setRole(roles);
//        user.setUserPassword(passwordEncoder.encode(user.getUserPassword()));
//        return userDao.save(user);
//    }
//}

package com.jwt.dao;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.jwt.entity.User;

@Repository
public interface UserDao extends CrudRepository<User, Long> {

    User findByUserName(String userName);  // Fixed method to match the username field.

    boolean existsByUserName(String userName);  // Correct existence check for username
}

package com.jwt.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.jwt.entity.Role;

@Repository
public interface RoleDao extends JpaRepository<Role, Integer> {
    Role findByRoleName(String name);
    
//    @Query("SELECT r FROM Role r WHERE r.name = :name")
//    Role findByName(@Param("name") String name);

}

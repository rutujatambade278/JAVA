package com.Emp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Emp.Entity.User;
import com.Emp.Repository.UserRepository;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class ServiceImage {
   
	@Autowired
    private UserRepository userRepository;

    public void saveImage(byte[] imageBytes) {
        User user = new User();
        user.setImageBytes(imageBytes); 
        userRepository.save(user);
    }
}

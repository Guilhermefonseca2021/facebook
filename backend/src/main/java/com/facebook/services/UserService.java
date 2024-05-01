package com.facebook.services;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.facebook.dto.UserRecordDTO;
import com.facebook.models.User;
import com.facebook.repository.UserRepository;


@Service
public class UserService {
    @Autowired
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(UserRecordDTO userRecordDTO) {
        User userModel = new User(); 
        BeanUtils.copyProperties(userRecordDTO, userModel);
        return userRepository.save(userModel);
    }
}
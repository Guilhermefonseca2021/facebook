package com.facebook.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.facebook.dto.UserRecordDTO;
import com.facebook.models.User;
import com.facebook.services.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/register")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<User> createUser(@Valid @RequestBody UserRecordDTO userRecordDTO) {
        User newUser = userService.createUser(userRecordDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(newUser);
    }
}
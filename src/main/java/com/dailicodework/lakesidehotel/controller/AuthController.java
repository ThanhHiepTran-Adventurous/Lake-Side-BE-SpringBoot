package com.dailicodework.lakesidehotel.controller;

import com.dailicodework.lakesidehotel.exception.UserAlreadyExistsException;
import com.dailicodework.lakesidehotel.model.User;
import com.dailicodework.lakesidehotel.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

@RequiredArgsConstructor
public class AuthController {
    private final IUserService userService;

    @PostMapping("/register-user")
    public ResponseEntity<?> registerUser(User user) {
        try {
            userService.registerUser(user);
            return ResponseEntity.ok("Registration successful");
        } catch (UserAlreadyExistsException e) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(e.getMessage());
        }
    }
}

package com.example.AuthService.controllers.impl;

import com.example.AuthService.common.dtos.TokenResponse;
import com.example.AuthService.common.dtos.UserRequest;
import com.example.AuthService.controllers.AuthApi;
import com.example.AuthService.services.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController implements AuthApi {
    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @Override
    public ResponseEntity<TokenResponse> createUser(UserRequest userRequest) {
        return ResponseEntity.ok(authService.createUser(userRequest));
    }
}

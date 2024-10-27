package com.example.AuthService.services;

import com.example.AuthService.common.dtos.TokenResponse;
import com.example.AuthService.common.dtos.UserRequest;

public interface AuthService {
    TokenResponse createUser(UserRequest userRequest);
}

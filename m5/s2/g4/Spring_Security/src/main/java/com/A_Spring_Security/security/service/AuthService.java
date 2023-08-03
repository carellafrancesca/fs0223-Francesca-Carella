package com.A_Spring_Security.security.service;

import com.A_Spring_Security.security.payload.LoginDto;
import com.A_Spring_Security.security.payload.RegisterDto;

public interface AuthService {
    
	String login(LoginDto loginDto);
    String register(RegisterDto registerDto);
    
}

package com.Gestione_Dispositivi.security.service;

import com.Gestione_Dispositivi.security.payload.LoginDto;
import com.Gestione_Dispositivi.security.payload.RegisterDto;

public interface AuthService {
    
	String login(LoginDto loginDto);
    String register(RegisterDto registerDto);
    
}

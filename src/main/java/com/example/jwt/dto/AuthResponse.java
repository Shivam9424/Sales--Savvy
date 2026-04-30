package com.example.jwt.dto;

public record AuthResponse(
		String token, 
		String tokenType, 
		String username,
		String role) {

}

package com.sh.autonomos.security.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.sh.autonomos.security.model.User;
import com.sh.autonomos.security.service.JwtService;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Service
public final class JwtServiceImpl implements JwtService {
	
	private final String key;
	
	public JwtServiceImpl(String key) {
		this.key = key;
	}
	
	@Override
	public String createTokenFor(User user) {
		
		//Date expiration = Date.from(LocalDateTime.now().plusHours(10).toInstant(UTC));
		
		Map<String, Object> claims = new HashMap<>();
		claims.put("user_name", user.getUsername());
		claims.put("name", user.getName());
		claims.put("surname", user.getSurname());
		claims.put("email", user.getEmail());		
		claims.put("roles", user.getRoles());
		
		return Jwts.builder()
		      .setSubject(user.getUsername())
		      .signWith(SignatureAlgorithm.HS512, "pepe")
		      .setClaims(claims)
		      .compact();
	}
}
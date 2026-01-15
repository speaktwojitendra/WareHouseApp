package com.spring.security;

import java.security.KeyPair;
import java.util.Date;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

@Component
public class Demo {
	private final static KeyPair keyPair = Keys.keyPairFor(SignatureAlgorithm.ES256);

	
	
Demo(){
	System.out.println("Hello");
}

public String getToken() {
	String jwt=Jwts.builder().setSubject("jitendra")
            .setIssuer("my-app")
            .setIssuedAt(new Date())
            .setExpiration(new Date(System.currentTimeMillis() + 3600000)) // 1 hour
            .signWith(keyPair.getPrivate())
            .compact();
	
return jwt;
}


}

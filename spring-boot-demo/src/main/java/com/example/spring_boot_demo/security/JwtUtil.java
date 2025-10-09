package com.example.spring_boot_demo.security;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import java.util.Date;

@Component
public class JwtUtil {

    private static final String SECERT_KEY_STRING = "SzimG2xqKgS2zSduQK1SLwX08OBveoOW";

    private final SecretKey SECERT_KEY = Keys.hmacShaKeyFor(SECERT_KEY_STRING.getBytes());


    public String generateToken(UserDetails userDetails){
        return Jwts.builder()
                .subject(userDetails.getUsername())
                .issuedAt(new Date())
                .expiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60 ))
                .signWith(SECERT_KEY, Jwts.SIG.HS256)
                .compact()
                ;
    }

    public boolean validateToken(String token, UserDetails userDetails){
        return extractUsername(token).equals(userDetails.getUsername());
    }

    public String extractUsername(String token){
        return Jwts.parser()
                .verifyWith(SECERT_KEY)
                .build()
                .parseSignedClaims(token)
                .getPayload()
                .getSubject();
    }
}

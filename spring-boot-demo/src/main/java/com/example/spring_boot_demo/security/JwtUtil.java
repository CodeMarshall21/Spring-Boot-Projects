package com.example.spring_boot_demo.security;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.security.core.userdetails.UserDetails;

import javax.crypto.SecretKey;
import java.util.Date;

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
}

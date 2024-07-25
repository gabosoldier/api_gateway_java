package com.vaxi.spring_boot_microservice_3_api_gateway.security.jwt;

import com.vaxi.spring_boot_microservice_3_api_gateway.security.UserPrincipal;
import org.springframework.security.core.Authentication;

import javax.servlet.http.HttpServletRequest;

public interface JwtProvider {
    String generateToken(UserPrincipal auth);

    Authentication getAuthentication(HttpServletRequest request);

    boolean isTokenVaalid(HttpServletRequest request);
}

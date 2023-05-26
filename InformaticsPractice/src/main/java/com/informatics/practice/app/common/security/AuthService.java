package com.informatics.practice.app.common.security;

public interface AuthService {
    AuthToken getToken(String token);
}

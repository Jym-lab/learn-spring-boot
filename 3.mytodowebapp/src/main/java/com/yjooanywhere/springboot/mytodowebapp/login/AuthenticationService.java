package com.yjooanywhere.springboot.mytodowebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public boolean authenticate(String username, String password){
        boolean isValidaUserName = username.equalsIgnoreCase("yjoo");
        boolean isValidPassword = password.equalsIgnoreCase("dummy");
        return isValidaUserName && isValidPassword;
    }
}

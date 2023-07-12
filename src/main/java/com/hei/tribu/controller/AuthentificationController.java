package com.hei.tribu.controller;

import com.hei.tribu.conf.security.model.AuthentificationRequest;
import com.hei.tribu.conf.security.utils.JwtUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/security/auth")
@RequiredArgsConstructor
public class AuthentificationController {
    private final AuthenticationManager authenticationManager;
    private final UserDetailsService userDetailsService;
    private final JwtUtils jwtUtils;
    @PostMapping("/authenticate")
    public ResponseEntity<String> authenticate(@RequestBody AuthentificationRequest request){
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(request.getEmail(), request.getPassword())
        );
        final UserDetails user = userDetailsService.loadUserByUsername(request.getEmail());
        return user != null ? ResponseEntity.ok(jwtUtils.generateToken(user)) : ResponseEntity.status(400).body("error when creating token");
    }
}

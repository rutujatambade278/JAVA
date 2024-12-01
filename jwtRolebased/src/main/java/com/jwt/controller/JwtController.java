package com.jwt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.jwt.entity.JwtRequest;
import com.jwt.entity.JwtResponse;
import com.jwt.service.JwtService;

@RestController
@CrossOrigin
public class JwtController {
    @Autowired
    private JwtService jwtService;

    @PostMapping("/authenticate")
    public JwtResponse createJwtToken(@RequestBody JwtRequest jwtRequest) throws Exception {
        return jwtService.createJwtToken(jwtRequest);
    }
}

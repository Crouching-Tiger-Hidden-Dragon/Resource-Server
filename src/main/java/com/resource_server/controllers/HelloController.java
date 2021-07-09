package com.resource_server.controllers;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello! This is team Crouching Tiger, Hidden Dragon!";
    }
}


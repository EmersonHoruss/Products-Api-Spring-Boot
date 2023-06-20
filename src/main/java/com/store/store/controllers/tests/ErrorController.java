package com.store.store.controllers.tests;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorController {
    @GetMapping(value = "/api/throwException")
    public void error(){
        throw new IllegalArgumentException("Its an error");
    }
}

package com.store.store.controllers.tests;

import com.store.store.DTOs.tests.ExceptionDTO;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("exception")
public class ExceptionController {
    @PostMapping("/validation")
    public void exceptionValidation(@RequestBody @Valid ExceptionDTO exceptionDTO){
        System.out.println("exception validation");

    }

    public void notFoundResource(){

    }
}
